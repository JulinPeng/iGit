/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-04-07 02:38:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head id=\"Head1\" runat=\"server\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\" />\r\n");
      out.write("    <title></title>\r\n");
      out.write("\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("    <meta content=\"\" name=\"description\" />\r\n");
      out.write("    <meta content=\"\" name=\"author\" />\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .dtStyle {\r\n");
      out.write("            color: white;\r\n");
      out.write("            margin-left: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Circle Buttons */\r\n");
      out.write("        .btn-circle {\r\n");
      out.write("            border-radius: 25px !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .displayPosition {\r\n");
      out.write("            /*position: fixed;\r\n");
      out.write("            /*top: 38%;\r\n");
      out.write("            left: 13.5%;*/\r\n");
      out.write("            /*top: 17%;\r\n");
      out.write("            left: 17%;*/\r\n");
      out.write("            display: block;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            /*z-index: 2;*/\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("            border: 1px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"resource/library/data-tables/css/jquery.dataTables.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/library/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/css/metro.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/library/bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"resource/library/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("    ");

    	String styleDefault = "resource/css/style_default.css";
		String scheme = application.getInitParameter("scheme");
     	if(scheme.equals("anxinjoy")){
     		styleDefault = "anxinzhuoyue/css/style_default.css";
     	}
    
      out.write("\r\n");
      out.write("    <link href=\"");
      out.print(styleDefault);
      out.write("\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"resource/css/style_responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/library/gritter/css/jquery.gritter.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"resource/library/uniform/css/uniform.default.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\" />\r\n");
      out.write("    <link href=\"resource/css/windowbox.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"resource/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .portfolio-text h4 {\r\n");
      out.write("            color: #555d69;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        /* extended dropdowns */\r\n");
      out.write("        .dropdown-menu.extended {\r\n");
      out.write("            min-width: 160px !important;\r\n");
      out.write("            max-width: 330px !important;\r\n");
      out.write("            width: 300px !important;\r\n");
      out.write("            background-color: #ffffff !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-menu.notification li a .time {\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            font-style: italic;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* 固定左侧菜单栏 */\r\n");
      out.write("        .page-sidebar {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!--隐藏百度地图logo的样式-->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .anchorBL {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            var color = getCookie('color');\r\n");
      out.write("            if (color != '' && color != null) {\r\n");
      out.write("                $('#style_color').attr(\"href\", \"resource/css/style_\" + color + \".css\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"fixed-top\">\r\n");
      out.write("    <div class=\"header navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("        <!-- BEGIN TOP NAVIGATION BAR -->\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- BEGIN LOGO -->\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a class=\"brand\" href=\"index.aspx\">\r\n");
      out.write("                        <div class=\"OrgLogoContain\" style=\"width: 100px; height: 20px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- END LOGO -->\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"span10\" style=\"margin-top: 10px;\" align=\"left\">\r\n");
      out.write("                    <font id=\"SysName\" color=\"#ffffff\" size=\"5px;\"></font>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <!-- BEGIN RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("                <a href=\"javascript:;\" class=\"btn-navbar collapsed\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("                    <img src=\"resource/img/menu-toggler.png\" alt=\"\" />\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- END RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- BEGIN TOP NAVIGATION MENU -->\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    <!-- modified by xiezhen -->\r\n");
      out.write("                    <!-- BEGIN NOTIFICATION DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown\" id=\"header_notification_bar\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"icon-warning-sign\"></i>\r\n");
      out.write("                            <span class=\"badge\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu extended notification\">\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <span id=\"lblUser\"></span>\r\n");
      out.write("                            <i class=\"icon-angle-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu enterManage\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- END USER LOGIN DROPDOWN -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- END TOP NAVIGATION MENU -->\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END TOP NAVIGATION BAR -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END HEADER -->\r\n");
      out.write("    <!-- BEGIN CONTAINER -->\r\n");
      out.write("    <div class=\"page-container row-fluid\">\r\n");
      out.write("        <!-- BEGIN SIDEBAR -->\r\n");
      out.write("        <div class=\"page-sidebar nav-collapse collapse\" style=\"z-index: 999\">\r\n");
      out.write("            <!-- BEGIN SIDEBAR MENU -->\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("                    <div class=\"sidebar-toggler hidden-phone\"></div>\r\n");
      out.write("                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <!-- END RESPONSIVE QUICK SEARCH FORM -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"index active has-sub\">\r\n");
      out.write("                    <a href=\"/index.aspx\">\r\n");
      out.write("                        <i class=\"icon-home\"></i>\r\n");
      out.write("                        <span class=\"title\">主页</span>\r\n");
      out.write("                        <span class=\"selected\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"has-sub\" id=\"struct-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <i class=\"icon-file\"></i>\r\n");
      out.write("                        <span class=\"title\">结构物</span>\r\n");
      out.write("                        <span class=\"arrow \"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub structure-list\">\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"warning\">\r\n");
      out.write("                    <a href=\"/DataWarningTest.aspx?master=masterClientOuter\">\r\n");
      out.write("                        <i class=\"icon-bell\"></i>\r\n");
      out.write("                        <span class=\"title\">告警管理</span>\r\n");
      out.write("                        <span class=\"selected\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"has-sub\">\r\n");
      out.write("                    <a href=\"/Report.aspx\">\r\n");
      out.write("                        <i class=\"icon-table\"></i>\r\n");
      out.write("                        <span class=\"title\">报表管理</span>\r\n");
      out.write("                        <span class=\"selected\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                  <li id=\"EngineeringLog\" class=\"has-sub\" style=\"display: none\">\r\n");
      out.write("                    <a href=\"/EngineeringLog.aspx?master=masterClientOuter\">\r\n");
      out.write("                        <i class=\"icon-edit\"></i>\r\n");
      out.write("                        <span class=\"title\">工程日志</span>\r\n");
      out.write("                        <span class=\"selected\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"has-sub \" id=\"systemConfig\">\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <i class=\"icon-wrench\"></i>\r\n");
      out.write("                        <span class=\"title\">系统配置</span>\r\n");
      out.write("                        <span class=\"arrow \"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("\r\n");
      out.write("                        <li id=\"userLog\"><a href=\"/UserLog.aspx\">用户日志</a></li>\r\n");
      out.write("                        <li id=\"alarmPushConfig\"><a href=\"/AlarmPushConfig.aspx?master=masterClientOuter\">告警推送配置</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"\">\r\n");
      out.write("                    <a href=\"javascript:logOut();\">\r\n");
      out.write("                        <i class=\"icon-user\"></i>\r\n");
      out.write("                        <span class=\"title\">退出</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END SIDEBAR -->\r\n");
      out.write("        <!-- BEGIN PAGE -->\r\n");
      out.write("        <div class=\"page-content\" id=\"pageContent\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- BEGIN PAGE HEADER-->\r\n");
      out.write("                <div class=\"row-fluid\" id=\"breadcrumbWrapper\">\r\n");
      out.write("                    <ul class=\"breadcrumb\" style=\"margin-top: 10px;\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"icon-home\"></i>\r\n");
      out.write("                            <a href=\"index.aspx\">主页</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <!-- END PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- END PAGE HEADER-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- GIS拓扑 -->\r\n");
      out.write("                    <div class=\"span12\" id=\"gisWrapper\">\r\n");
      out.write("                        <!-- BEGIN REGIONAL STATS PORTLET-->\r\n");
      out.write("                        <div id=\"portletGIS\" class=\"portlet\">\r\n");
      out.write("                            <div class=\"portlet-title\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"portlet-body\" style=\"position: relative;\">\r\n");
      out.write("                                <div id=\"displayWeather\" class=\"displayPosition\" style=\"z-index: 999;position: absolute;top: 10px; left: 75px;\"></div>\r\n");
      out.write("                                <div id=\"tipNoData-map\"></div>\r\n");
      out.write("                                <div id=\"map_canvas\" style=\"height: 500px;\">\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- END REGIONAL STATS PORTLET-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- END GIS拓扑 -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("                <div class=\"row-fluid\">\r\n");
      out.write("                    <!-- 结构物状态 -->\r\n");
      out.write("                    <div class=\"span12\" id=\"structStatusWrapper\">\r\n");
      out.write("                        <!-- BEGIN PORTLET-->\r\n");
      out.write("                        <div class=\"portlet paddingless\">\r\n");
      out.write("                            <div class=\"portlet-title line\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"portlet-body\">\r\n");
      out.write("                                <div id=\"tipNoData-health\"></div>\r\n");
      out.write("                                <table id=\"tableStructState\" width=\"100%\" class=\"table table-striped table-bordered\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th style=\"width: 9%;\">组织</th>\r\n");
      out.write("                                            <th style=\"width: 9%;\">结构物</th>\r\n");
      out.write("                                            <th style=\"width: 3%;\">状态</th>\r\n");
      out.write("                                            <th style=\"width: 9%;\">工况概述</th>\r\n");
      out.write("                                            <th style=\"width: 5%;\">告警数目</th>\r\n");
      out.write("                                            <th style=\"width: 20%;\">最新报表</th>\r\n");
      out.write("                                            <th style=\"display: none;\">&nbsp;</th>\r\n");
      out.write("                                            <th style=\"display: none;\">&nbsp;</th>\r\n");
      out.write("                                            <th style=\"display: none;\">&nbsp;</th>\r\n");
      out.write("                                            <th style=\"display: none;\">&nbsp;</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody id=\"tbodyStructState\">\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- END PORTLET-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- END 结构物状态 -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"viewLine\" class=\"modal hide fade\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("                    <h3>历史线路进度</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <table id=\"viewLine-table\" width=\"100%\" class=\"table table-striped table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th style=\"width: 7%;\">线路长度</th>\r\n");
      out.write("                                <th style=\"width: 12%;\">已施工长度</th>\r\n");
      out.write("                                <th style=\"width: 4%;\">进度</th>\r\n");
      out.write("                                <th style=\"width: 19%;\">记录时间</th>\r\n");
      out.write("                                <th style=\"width: 15%;\">施工状况</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody id=\"viewLine-tbody\"></tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END PAGE -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END CONTAINER -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\" id=\"copyright\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"span pull-right\">\r\n");
      out.write("            <span class=\"go-top\"><i class=\"icon-angle-up\"></i></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form runat=\"server\">\r\n");
      out.write("        <asp:HiddenField ID=\"reportpath\" runat=\"server\" ClientIDMode=\"Static\" />\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<script>\r\n");
      out.write("\tvar apiurl = \"");
      out.print(application.getInitParameter("ApiURL"));
      out.write("\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"resource/library/breakpoints/breakpoints.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/data-tables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/jquery-ui/jquery-ui-1.10.1.custom.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/uipackage/uiTheme.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/jquery.blockui.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/jquery.cookie.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"resource/library/uniform/jquery.uniform.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/gritter/js/jquery.gritter.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/jquery.pulsate.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/app.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/securecloud.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/jquery.number.min.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/JSPinyin/pinyin.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var userId = getCookie('userId');\r\n");
      out.write("        if (userId === '' || userId === null) {\r\n");
      out.write("            alert('获取用户Id失败，请检查浏览器Cookie是否已启用');\r\n");
      out.write("            logOut();\r\n");
      out.write("        }\r\n");
      out.write("        if (getCookie('orgId') === \"116\") {\r\n");
      out.write("            $(\"#EngineeringLog\").css(\"display\", \"block\");\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"#EngineeringLog\").css(\"display\", \"none\");\r\n");
      out.write("        }\r\n");
      out.write("        if (getCookie('portal') == \"U\") { // User\r\n");
      out.write("            $('.enterManage').html('<li><a href=\"/account.aspx\"><i class=\"icon-user\"></i>账户</a></li>'\r\n");
      out.write("                + '<li class=\"divider\"></li>'\r\n");
      out.write("                + '<li><a id=\"btnLogout\" href=\"javascript:logOut();\"><i class=\"icon-key\"></i>退出</a></li>');\r\n");
      out.write("        } else { // Manager\r\n");
      out.write("            $('.enterManage').html(' <li><a href=\"#\" onclick=\"enterManageInterface()\"><i class=\"icon-refresh\"></i>进入管理侧</a></li>'\r\n");
      out.write("               + '<li class=\"divider\"></li>'\r\n");
      out.write("               + '<li><a href=\"/account.aspx\"><i class=\"icon-user\"></i>账户</a></li>'\r\n");
      out.write("               + '<li class=\"divider\"></li>'\r\n");
      out.write("               + '<li><a id=\"btnLogout\" href=\"javascript:logOut();\"><i class=\"icon-key\"></i>退出</a></li>');\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"resource/library/highcharts/highcharts.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=wEiighBCdHAkOrXRHDsqlgW5\"></script>\r\n");
      out.write("    \r\n");
      out.write("\t");

    	String gisScriptPath = "resource/js/mapGIS.js?r=" + Math.random();
    	String cookieUserId = null;
    	Cookie[] cookies = request.getCookies();
    	if(cookies == null){
    		return;
    	}else{
    		for (int i = 0; i < cookies.length; i++) {
    			Cookie cookie = cookies[i];
    				if (cookie.getName().equals("userId")) {
    					cookieUserId = cookie.getValue();
    					break;
    				}
    		}
    	}
    	if(cookieUserId == null){
    		return;
    	}
    	String configUserIds = application.getInitParameter("QingDaoR3UserId");
    	if(configUserIds.contains(cookieUserId)){
    		gisScriptPath = "resource/js/mapGisQingDaoR3.js?r=" + Math.random();
    	}
    
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(gisScriptPath);
      out.write("\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"resource/js/DisplayWeather.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/alarmBadge.js\"></script>\r\n");
      out.write("    <script src=\"resource/js/index.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        jQuery(document).ready(function () {\r\n");
      out.write("            var color = getCookie('color');\r\n");
      out.write("            if (color != '' && color != null) {\r\n");
      out.write("                $('#style_color').attr(\"href\", \"resource/css/style_\" + color + \".css\");\r\n");
      out.write("            }\r\n");
      out.write("            App.setPage(\"index\");  // set current page\r\n");
      out.write("            App.init(); // init the rest of plugins and elements\r\n");
      out.write("\r\n");
      out.write("            $('#struct-menu,#systemConfig,#manage,#hotspotBU').click(function () {\r\n");
      out.write("                $('.has-sub').removeClass('active');\r\n");
      out.write("                $(this).addClass('active');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"resource/js/downLoadReport.js\"></script>\r\n");
      out.write("    <script src=\"resource/library/bootstrap/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("</body>\r\n");
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
