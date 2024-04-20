package demo.hmvc.adaptador.handle;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class RequestProcesadorInterceptador implements HandlerInterceptor{
	/**
	 * This implementation always returns {@code true}.
	 */
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {	
		
			/*Optional<Token> Res = Optional.ofNullable(TokenService.ValidarToken(request.getHeader("fingerprint"),request.getHeader("token")));	
			if (Res.isPresent())	
				return true;
			else {				
				
			//	RequestFail RequestFail, long id
				System.out.println(request.getLocalAddr());
				System.out.println(request.getLocalName());
				System.out.println(request.getProtocol());
				System.out.println(request.getMethod());
				System.out.println(request.getCharacterEncoding());
				
				RequestFail RequestF = new RequestFail();
				RequestF.setLocalAddres(request.getLocalAddr());
				RequestF.setLocalName(request.getLocalName());
				RequestF.setProtocolo(request.getProtocol());
				RequestF.setMetodo(request.getMethod());
				RequestF.setEncode(request.getCharacterEncoding());
				RequestF.setHuellaApp(request.getHeader("fingerprint"));
				RequestFailService.AgregarRequestFail(RequestF);
					
				throw new FaulTokeAnauthorizedException("No Autorizado Token");
				
			}*/
			return true;
	}	

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
