/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-04-07 02:32:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/common.jsp", Long.valueOf(1459996222917L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if IE 8]> <html lang=\"cn\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9]> <html lang=\"cn\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"cn\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\" />\r\n");
      out.write("    <meta content=\"\" name=\"description\" />\r\n");
      out.write("    <meta content=\"\" name=\"author\" />\r\n");
      out.write("    <link href=\"resource/library/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"resource/css/metro.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/library/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/css/style_responsive.css\" rel=\"stylesheet\" />    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"resource/library/uniform/css/uniform.default.css\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write(".navi {\r\n");
      out.write("    padding-top: 10px;\r\n");
      out.write("    line-height: 40px;\r\n");
      out.write("    border-bottom: 1px solid #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".area {\r\n");
      out.write("    min-height: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi-brand {\r\n");
      out.write("    line-height: 40px;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi-bar {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi-bar li {\r\n");
      out.write("    float: left;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    line-height: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi-bar li a {\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("<body class=\"login\">\r\n");
      out.write("<!-- BEGIN FREE-SUN LOGIN HEADER -->\r\n");
      out.write("<div id=\"head-head\" class=\"container-fluid navi anxinyun-nav\" style=\"display: none;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navi-brand\">\r\n");
      out.write("            <img class=\"img-responsible\" src=\"resource/img/index-2.0/logo-big.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"navi-bar right-block\">\r\n");
      out.write("            <li><a href=\"index.html\">首页</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"autoLogin\">监测云</a></li>\r\n");
      out.write("            <li><a href=\"http://service.anxinyun.cn\">数据云</a></li>\r\n");
      out.write("            <li><a href=\"http://218.3.150.107:8002\">桥梁技术状况评定</a></li>\r\n");
      out.write("            <li><a href=\"http://www.free-sun.com.cn\" target=\"_blank\">关于我们</a></li>\r\n");
      out.write("            <li style=\"margin-top: -4px\">\r\n");
      out.write("                <a href=\"http://e.weibo.com/freesuntech?type=0\" target=\"_blank\"\r\n");
      out.write("                   class=\"weibo\">\r\n");
      out.write("                    <img src=\"resource/img/index-2.0/small-weibo-c.png\"/>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END FREE-SUN LOGIN HEADER -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN SHOU-YANG LOGIN HEADER -->\r\n");
      out.write("<div id=\"shouyang-login-header\" class=\"container-fluid navi\" style=\"margin-bottom: 100px; display: none;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navi-brand\">\r\n");
      out.write("            <div class=\"span11\" align=\"center\">\r\n");
      out.write("                <img class=\"img-responsible\" src=\"resource/uipackage/logo/logo-big.png\" />\r\n");
      out.write("                <font color=\"#ffffff\" size=\"6px;\">安徽省高速公路试验检测科研中心有限公司</font>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END SHOU-YANG LOGIN HEADER -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"logo-space\"></div>\r\n");
      out.write("<!-- BEGIN LOGIN -->\r\n");
      out.write("<div class=\"content\" style=\"margin-top: 100px;\">\r\n");
      out.write("    <!-- BEGIN LOGIN FORM -->\r\n");
      out.write("    <form class=\"form-vertical login-form\">\r\n");
      out.write("        <h3 class=\"form-title\">登录</h3>\r\n");
      out.write("        <div class=\"alert alert-error hide\">\r\n");
      out.write("            <button class=\"close\" data-dismiss=\"alert\"></button>\r\n");
      out.write("            <span>请输入用户名和密码</span> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">账号</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-user\"></i>\r\n");
      out.write("                    <input id=\"username\" class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"账号\" name=\"username\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">密码</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("                    <input id=\"password\" class=\"m-wrap placeholder-no-fix\" type=\"password\" placeholder=\"密码\" name=\"password\" onkeypress=\"TextValidate()\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span id=\"caseTip\" style=\"display: none;\">大写锁定键被按下，请注意大小写</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("            <label class=\"checkbox\">\r\n");
      out.write("                <input type=\"checkbox\" name=\"remember\" value=\"1\"/>\r\n");
      out.write("                一周内自动登录\r\n");
      out.write("            </label>\r\n");
      out.write("            <button type=\"submit\" id=\"btnLogin\" class=\"btn green pull-right\">\r\n");
      out.write("                登录 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"forget-password\">\r\n");
      out.write("            <h4>忘记密码？</h4>\r\n");
      out.write("            <p>\r\n");
      out.write("                不要担心，点击 <a href=\"javascript:;\" class=\"\" id=\"forget-password\">这里</a>\r\n");
      out.write("                重置您的密码。\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>-->\r\n");
      out.write("        <div class=\"create-account\">\r\n");
      out.write("            <h4>需要修改密码？</h4>\r\n");
      out.write("            <p>\r\n");
      out.write("                不要担心，请点击 <a href=\"javascript:;\" id=\"register-btn\" class=\"\">这里</a> 修改您的密码\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <!-- END LOGIN FORM -->\r\n");
      out.write("    <!-- BEGIN FORGOT PASSWORD FORM -->\r\n");
      out.write("    <form class=\"form-vertical forget-form\" action=\"index.aspx\">\r\n");
      out.write("        <h3 class=\"\">忘记密码？</h3>\r\n");
      out.write("        <p>请输入您的邮箱重置密码。</p>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-envelope\"></i>\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"邮箱\" name=\"email\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("            <button type=\"button\" id=\"back-btn\" class=\"btn\">\r\n");
      out.write("                <i class=\"m-icon-swapleft\"></i>回退\r\n");
      out.write("            </button>\r\n");
      out.write("            <button type=\"submit\" class=\"btn green pull-right\">\r\n");
      out.write("                提交 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <!-- END FORGOT PASSWORD FORM -->\r\n");
      out.write("    <!-- BEGIN REGISTRATION FORM -->\r\n");
      out.write("    <form class=\"form-vertical register-form\" action=\"index.aspx\">\r\n");
      out.write("        <h3 class=\"\">修改密码</h3>\r\n");
      out.write("        <p>请输入您的用户信息：</p>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">账号</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-user\"></i>\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" id=\"UserName\" placeholder=\"账号\" name=\"UserName\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">旧密码</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" id=\"Old_password\" placeholder=\"旧密码\" name=\"Old_password\" onkeypress=\"TextValidate()\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">新密码</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" id=\"New_password\" placeholder=\"新密码\" name=\"New_password\" onkeypress=\"TextValidate()\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" id=\"Confirm_New_password\" placeholder=\"再次输入新密码\" name=\"Confirm_New_password\" onkeypress=\"TextValidate()\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("            <button id=\"register-back-btn\" type=\"button\" class=\"btn\">\r\n");
      out.write("                <i class=\"m-icon-swapleft\"></i>回退\r\n");
      out.write("            </button>\r\n");
      out.write("            <button type=\"submit\" id=\"register-submit-btn\" class=\"btn green pull-right\">\r\n");
      out.write("                确认修改 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <!-- END REGISTRATION FORM -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END LOGIN -->\r\n");
      out.write("<!-- BEGIN COPYRIGHT -->\r\n");
      out.write("<div class=\"copyright\" id=\"copyright\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END COPYRIGHT -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar apiurl = \"");
      out.print(application.getInitParameter("ApiURL"));
      out.write("\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN JAVASCRIPTS -->\r\n");
      out.write("<script src=\"resource/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"resource/library/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"resource/library/uniform/jquery.uniform.min.js\"></script>\r\n");
      out.write("<script src=\"resource/uipackage/uiTheme.js\"></script>\r\n");
      out.write("<script src=\"resource/js/jquery.blockui.js\"></script>\r\n");
      out.write("<script src=\"resource/library/jquery-validation/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"resource/js/securecloud.js\"></script>\r\n");
      out.write("<script src=\"resource/js/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    var re = /^[A-Za-z0-9_]*$/;\r\n");
      out.write("    $('#username').on('change', function() {\r\n");
      out.write("        if (re.test($('#username').val()) == false) {\r\n");
      out.write("            $('span', $('.alert-error', $('.login-form'))).html('用户名由字母、数字和下划线组成');\r\n");
      out.write("            $('.alert-error', $('.login-form')).show();\r\n");
      out.write("            $('#username').focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.alert-error', $('.login-form')).hide();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    $('#register-submit-btn').click(function() {\r\n");
      out.write("        var newPwd = $('#New_password').val();\r\n");
      out.write("        if (!/^[a-zA-Z0-9]{1,15}$/.test(newPwd) || newPwd == \"\") {\r\n");
      out.write("            $('#New_password').focus();\r\n");
      out.write("            if (document.all) {\r\n");
      out.write("                window.event.returnValue = false;\r\n");
      out.write("            } else {\r\n");
      out.write("                arguments.callee.caller.arguments[0].preventDefault();\r\n");
      out.write("            }\r\n");
      out.write("        } else if ((!testLetter(newPwd)) || (!testDigital(newPwd))) {\r\n");
      out.write("            alert(\"密码设置过简单\");\r\n");
      out.write("            $('#New_password').focus();\r\n");
      out.write("            if (document.all) {\r\n");
      out.write("                window.event.returnValue = false;\r\n");
      out.write("            } else {\r\n");
      out.write("                arguments.callee.caller.arguments[0].preventDefault();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    jQuery(document).ready(function() {\r\n");
      out.write("        App.initLogin();\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //<![CDATA[\r\n");
      out.write("    function detectCapsLock(event) {\r\n");
      out.write("        var e = event || window.event;\r\n");
      out.write("        var o = e.target || e.srcElement;\r\n");
      out.write("        //var oTip = o.nextSibling;\r\n");
      out.write("        var oTip = document.getElementById('caseTip');\r\n");
      out.write("        var keyCode = e.keyCode || e.which; // 按键的keyCode \r\n");
      out.write("        var isShift = e.shiftKey || (keyCode == 16) || false; // shift键是否按住\r\n");
      out.write("        if (\r\n");
      out.write("            ((keyCode >= 65 && keyCode <= 90) && !isShift) // Caps Lock 打开，且没有按住shift键 \r\n");
      out.write("                || ((keyCode >= 97 && keyCode <= 122) && isShift) // Caps Lock 打开，且按住shift键\r\n");
      out.write("        ) {\r\n");
      out.write("            oTip.style.display = '';\r\n");
      out.write("        } else {\r\n");
      out.write("            oTip.style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.getElementById('password').onkeypress = detectCapsLock;\r\n");
      out.write("    //]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- END JAVASCRIPTS -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- END BODY -->\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
