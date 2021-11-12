Servlets And JSP
--------------------------------------------------------------------
    Lab Setup
    --------------------
    Eclipse JavaEE IDE
    JDK 8
    Tomcat 8.5              https://tomcat.apache.org/download-80.cgi


    Dynamic Web Application
    -------------------------- (Distributed (Server-client) App)

        Web-Server                                              Browser (Client)
                (Apache Tomcat)                                             (Chrome)
            
            OurWebApp               <-------Http Reqeust-----------     URL
                req is processed
                a response is generated
                                    ------Http Response--------------> Dynamically geenrated HTML


     Http Request
     ---------------------------
            Headers     
                    URL (prototype://hostname:port/resource?querystring)
                    method: GET | POST
                    authentiction tokens/....etc 
            Body   
                    will carry data in case of POST request
                    cookies 

    Http Response
    -------------------------------
            Headers
                    content-type (MIME type): text/html or text/css or appliction/json or image/png ..etc
                    response-code : 
                        1xx     indicates the successful reception of reqeust and that the requst is being processed.2xx     indicates the successful compeltion of req processing, 
                        3xx     indicates that the resposne is being redirected to elsewhere,
                        4xx     indicates the failed request processing due to client side error, 
                        5xx     indicates the failed request processing due to server side error

                    autentication details ....etc

            Body
                    also called the response content.

    
    Servlets
    -------------------------------

        means a server side executing java program.

        is capable of receving a request and generating a response.

        Servlet API
        ---------------------------------
            javax.servlet
                GenericServlet    abstract class
                ServletContext    interface -> refers to the webserver on which the current servlet is executing
                ServletConfig     interface -> refers to the local information about a servlet
                ServletReqeust    interface
                ServletResponse   interface

            javax.servlet.http
                HttpServlet             class       extends GenericServlet
                HttpServletRequest      interface
                HttpServletResponse     interface
                Cookie                  class
                HttpSession             class
                ReqeustDispatcher       interface

        ServletContext
            public String getServletContextName();      returns the name of the web application
            public Object getAttribute(String key);
            public void setAttribute(String key,Object value);
            public void remmoveAttribute(String key);

        GenericServlet 
            public abstract void service(ServletRequest req,ServletResponse resp);
            public ServletContext getServletContext();

        HttpServlet
            public void init()      
                    //does the initializaton activities if any just before the servlet gets its first request.
            public void doGet(HttpServletReqeust req,HttpServletResponse resp);
            public void doPost(HttpServletReqeust req,HttpServletResponse resp);
            public void destroy()
                    //does the clean up operatiosn just before the servlet is killed.

        So we can create our own servlet through a class that extends HttpServlet and overrides the moethods.

        1. Developer is not creating or manging the Servlet objects.
        2. WebServer is the one that manages the life cycle of the servlet
            a. create a servlet object
            b. call init method on that object
            c. call doGET or doPost on that object
            d. call destroy on that object
            e. will destroy the object
        
        Any software that manages the life cycle of a java object is called a CONTAINER or CONTEXT and that
        java object is called a BEAN.

        Because WebServer is behaving like a CONTAINER or CONTEXT , I mean, the webserver is
        manging the life cyle of Servlets, webserver is called ServletContainer or ServletContext.





        




