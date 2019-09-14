package lingual.exceptions;

import java.util.Iterator;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.application.NavigationHandler;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;


//ExceptionHandlerWrapper - JSF wrapper class which requires only to override getWrapped() method to return the
//instance of the class you're wrapping, which is often simply passed to the constructor
public class ViewExpiredExceptionHandler extends ExceptionHandlerWrapper {

  private ExceptionHandler handler;

  public ViewExpiredExceptionHandler(ExceptionHandler handler) {
      this.handler = handler;
  }

  @Override
  public ExceptionHandler getWrapped() {
      return handler;
  }

  //once we override getWrapped(), we need only override those methods we're interested in. In this case, we want to override only handle()
  @Override
  public void handle() throws FacesException {
      final Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents().iterator();
      while (i.hasNext()) {
          ExceptionQueuedEvent event = i.next();
          ExceptionQueuedEventContext context
                  = (ExceptionQueuedEventContext) event.getSource();

          // get the exception from context
          Throwable t = context.getException();

          final FacesContext fc = FacesContext.getCurrentInstance();
          final Map<String, Object> requestMap = fc.getExternalContext().getRequestMap();
          final NavigationHandler nav = fc.getApplication().getNavigationHandler();

          //here you do what ever you want with exception
          try {

              //log error ?
              //log.log(Level.SEVERE, "Critical Exception!", t);
              if (t instanceof ViewExpiredException) {
                  requestMap.put("javax.servlet.error.message", "Session expired, try again!");
                  String errorPageLocation = "/WEB-INF/errorpages/viewExpired.xhtml";
                  fc.setViewRoot(fc.getApplication().getViewHandler().createView(fc, errorPageLocation));
                  fc.getPartialViewContext().setRenderAll(true);
                  fc.renderResponse();
              } else {
                  //redirect error page
                  requestMap.put("javax.servlet.error.message", t.getMessage());
                  nav.handleNavigation(fc, null, "/WEB-INF/errorpages/general.xhtml");
              }

              fc.renderResponse();
              // remove the comment below if you want to report the error in a jsf error message
              //JsfUtil.addErrorMessage(t.getMessage());
          } finally {
              //remove it from queue
              i.remove();
          }
      }
      //parent handle
      getWrapped().handle();
  }

}