<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit" />
    <title></title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />

    <style>
        .dtStyle {
            color: white;
            margin-left: 60px;
        }

        /* Circle Buttons */
        .btn-circle {
            border-radius: 25px !important;
        }

        .displayPosition {
            /*position: fixed;
            /*top: 38%;
            left: 13.5%;*/
            /*top: 17%;
            left: 17%;*/
            display: block;
            padding: 5px;
            outline: none;
            cursor: pointer;
            /*z-index: 2;*/
            background-color: white;
            opacity: 0.8;
            border: 1px;
            text-align: center;
            font-size: 12px;
        }
    </style>

    <link href="resource/library/data-tables/css/jquery.dataTables.min.css" rel="stylesheet" />
    <link href="resource/library/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="resource/css/metro.css" rel="stylesheet" />
    <link href="resource/library/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />

    <link href="resource/library/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="resource/css/style.css" rel="stylesheet" />
    
    <%
    	String styleDefault = "resource/css/style_default.css";
		String scheme = application.getInitParameter("scheme");
     	if(scheme.equals("anxinjoy")){
     		styleDefault = "anxinzhuoyue/css/style_default.css";
     	}
    %>
    <link href="<%=styleDefault%>" rel="stylesheet" />
    
    <link href="resource/css/style_responsive.css" rel="stylesheet" />
    <link href="resource/library/gritter/css/jquery.gritter.css" rel="stylesheet" />
    <link href="resource/library/uniform/css/uniform.default.css" rel="stylesheet" />
    <link rel="shortcut icon" href="favicon.ico" />
    <link href="resource/css/windowbox.css" rel="stylesheet" />
    <script src="resource/js/jquery-1.8.3.min.js"></script>

    <style>
        .portfolio-text h4 {
            color: #555d69;
            font-size: 20px;
            font-weight: 400;
            margin-top: 10px;
        }
        /* extended dropdowns */
        .dropdown-menu.extended {
            min-width: 160px !important;
            max-width: 330px !important;
            width: 300px !important;
            background-color: #ffffff !important;
        }

        .dropdown-menu.notification li a .time {
            font-size: 12px;
            font-style: italic;
            font-weight: 600;
            position: absolute;
            right: 10px;
        }

        /* 固定左侧菜单栏 */
        .page-sidebar {
            position: fixed;
        }
    </style>
    <!--隐藏百度地图logo的样式-->
    <style type="text/css">
        .anchorBL {
            display: none;
        }
    </style>
    <script>
        $(function () {
            var color = getCookie('color');
            if (color != '' && color != null) {
                $('#style_color').attr("href", "resource/css/style_" + color + ".css");
            }
        });
    </script>

</head>
<body class="fixed-top">
    <div class="header navbar navbar-inverse navbar-fixed-top">
        <!-- BEGIN TOP NAVIGATION BAR -->
        <div class="navbar-inner">
            <div class="container-fluid">
                <!-- BEGIN LOGO -->
                <div>
                    <a class="brand" href="index.aspx">
                        <div class="OrgLogoContain" style="width: 100px; height: 20px;">
                        </div>
                    </a>
                    <!-- END LOGO -->
                </div>
                <%-- <div class="span8">
                    <marquee class="pageT" scrollamount="4" direction="left" behavior="scroll" style="margin-top: 10px;"><font color="#ffffff" size="5px;" ></font></marquee>
                </div>--%>
                <div class="span10" style="margin-top: 10px;" align="left">
                    <font id="SysName" color="#ffffff" size="5px;"></font>
                </div>
                <%--<div>--%>
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
                    <img src="resource/img/menu-toggler.png" alt="" />
                </a>
                <!-- END RESPONSIVE MENU TOGGLER -->


                <!-- BEGIN TOP NAVIGATION MENU -->
                <ul class="nav pull-right">
                    <!-- modified by xiezhen -->
                    <!-- BEGIN NOTIFICATION DROPDOWN -->

                    <li class="dropdown" id="header_notification_bar">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-warning-sign"></i>
                            <span class="badge"></span>
                        </a>
                        <ul class="dropdown-menu extended notification">
                        </ul>
                    </li>


                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <span id="lblUser"></span>
                            <i class="icon-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu enterManage">
                            <%--         <li><a href="#" onclick="enterManageInterface()"><i class="icon-refresh"></i>进入管理侧</a></li>
                                <li class="divider"></li>
                                <li><a href="/account.html"><i class="icon-user"></i>账户</a></li>
                                <li class="divider"></li>
                                <li><a id="btnLogout" href="javascript:logOut();"><i class="icon-key"></i>退出</a></li>--%>
                        </ul>
                    </li>
                    <!-- END USER LOGIN DROPDOWN -->
                </ul>
                <!-- END TOP NAVIGATION MENU -->
                <%--</div>--%>
            </div>
        </div>
        <!-- END TOP NAVIGATION BAR -->
    </div>
    <!-- END HEADER -->
    <!-- BEGIN CONTAINER -->
    <div class="page-container row-fluid">
        <!-- BEGIN SIDEBAR -->
        <div class="page-sidebar nav-collapse collapse" style="z-index: 999">
            <!-- BEGIN SIDEBAR MENU -->
            <ul>
                <li>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                    <div class="sidebar-toggler hidden-phone"></div>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                </li>
                <li>
                    <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
                    <%--<form class="sidebar-search">
                        <div class="input-box">
                            <a href="javascript:;" class="remove"></a>
                            <input type="text" placeholder="搜索..." />
                            <input type="button" class="submit" disabled="disabled" value=" " />
                        </div>
                    </form>--%>
                    <!-- END RESPONSIVE QUICK SEARCH FORM -->
                </li>
                <li class="index active has-sub">
                    <a href="/index.aspx">
                        <i class="icon-home"></i>
                        <span class="title">主页</span>
                        <span class="selected"></span>
                    </a>
                </li>
                <li class="has-sub" id="struct-menu">
                    <a href="javascript:;">
                        <i class="icon-file"></i>
                        <span class="title">结构物</span>
                        <span class="arrow "></span>
                    </a>
                    <ul class="sub structure-list">
                    </ul>
                </li>
                <li class="warning">
                    <a href="/DataWarningTest.aspx?master=masterClientOuter">
                        <i class="icon-bell"></i>
                        <span class="title">告警管理</span>
                        <span class="selected"></span>
                    </a>
                </li>

                <li class="has-sub">
                    <a href="/Report.aspx">
                        <i class="icon-table"></i>
                        <span class="title">报表管理</span>
                        <span class="selected"></span>
                    </a>
                </li>
                  <li id="EngineeringLog" class="has-sub" style="display: none">
                    <a href="/EngineeringLog.aspx?master=masterClientOuter">
                        <i class="icon-edit"></i>
                        <span class="title">工程日志</span>
                        <span class="selected"></span>
                    </a>
                </li>
                <li class="has-sub " id="systemConfig">
                    <a href="javascript:;">
                        <i class="icon-wrench"></i>
                        <span class="title">系统配置</span>
                        <span class="arrow "></span>
                    </a>
                    <ul class="sub">

                        <li id="userLog"><a href="/UserLog.aspx">用户日志</a></li>
                        <li id="alarmPushConfig"><a href="/AlarmPushConfig.aspx?master=masterClientOuter">告警推送配置</a></li>
                    </ul>
                </li>
                <li class="">
                    <a href="javascript:logOut();">
                        <i class="icon-user"></i>
                        <span class="title">退出</span>
                    </a>
                </li>
            </ul>
        </div>
        <!-- END SIDEBAR -->
        <!-- BEGIN PAGE -->
        <div class="page-content" id="pageContent">

            <div class="container-fluid">
                <!-- BEGIN PAGE HEADER-->
                <div class="row-fluid" id="breadcrumbWrapper">
                    <ul class="breadcrumb" style="margin-top: 10px;">
                        <li>
                            <i class="icon-home"></i>
                            <a href="index.aspx">主页</a>
                        </li>
                    </ul>

                    <!-- END PAGE TITLE & BREADCRUMB-->
                </div>
                <!-- END PAGE HEADER-->

                <div class="row-fluid">

                    <!-- GIS拓扑 -->
                    <div class="span12" id="gisWrapper">
                        <!-- BEGIN REGIONAL STATS PORTLET-->
                        <div id="portletGIS" class="portlet">
                            <div class="portlet-title">
                            </div>
                            <div class="portlet-body" style="position: relative;">
                                <div id="displayWeather" class="displayPosition" style="z-index: 999;position: absolute;top: 10px; left: 75px;"></div>
                                <div id="tipNoData-map"></div>
                                <div id="map_canvas" style="height: 500px;">
                                    
                                </div>
                            </div>
                        </div>
                        <!-- END REGIONAL STATS PORTLET-->
                    </div>
                    <!-- END GIS拓扑 -->

                </div>
                <div class="clearfix"></div>
                <div class="row-fluid">
                    <!-- 结构物状态 -->
                    <div class="span12" id="structStatusWrapper">
                        <!-- BEGIN PORTLET-->
                        <div class="portlet paddingless">
                            <div class="portlet-title line">
                            </div>
                            <div class="portlet-body">
                                <div id="tipNoData-health"></div>
                                <table id="tableStructState" width="100%" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th style="width: 9%;">组织</th>
                                            <th style="width: 9%;">结构物</th>
                                            <th style="width: 3%;">状态</th>
                                            <th style="width: 9%;">工况概述</th>
                                            <th style="width: 5%;">告警数目</th>
                                            <th style="width: 20%;">最新报表</th>
                                            <th style="display: none;">&nbsp;</th>
                                            <th style="display: none;">&nbsp;</th>
                                            <th style="display: none;">&nbsp;</th>
                                            <th style="display: none;">&nbsp;</th>
                                        </tr>
                                    </thead>
                                    <tbody id="tbodyStructState">
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <!-- END PORTLET-->
                    </div>
                    <!-- END 结构物状态 -->
                </div>
                <div class="clearfix"></div>
            </div>


            <div id="viewLine" class="modal hide fade">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h3>历史线路进度</h3>
                </div>
                <div class="modal-body">
                    <table id="viewLine-table" width="100%" class="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th style="width: 7%;">线路长度</th>
                                <th style="width: 12%;">已施工长度</th>
                                <th style="width: 4%;">进度</th>
                                <th style="width: 19%;">记录时间</th>
                                <th style="width: 15%;">施工状况</th>
                            </tr>
                        </thead>
                        <tbody id="viewLine-tbody"></tbody>
                    </table>
                </div>
                <div class="modal-footer">
                    <button class="btn" data-dismiss="modal">关闭</button>
                </div>
            </div>

        </div>
        <!-- END PAGE -->
    </div>
    <!-- END CONTAINER -->

    <div class="footer" id="copyright" align="center">

        <div class="span pull-right">
            <span class="go-top"><i class="icon-angle-up"></i></span>
        </div>
    </div>
    <form runat="server">
        <asp:HiddenField ID="reportpath" runat="server" ClientIDMode="Static" />
    </form>

	<%@ include file="common.jsp" %>

    <script src="resource/library/breakpoints/breakpoints.js"></script>
    <script src="resource/library/data-tables/js/jquery.dataTables.min.js"></script>
    <script src="resource/library/jquery-ui/jquery-ui-1.10.1.custom.min.js"></script>
    <script src="resource/library/jquery-slimscroll/jquery.slimscroll.min.js"></script>
    <script src="resource/library/bootstrap/js/bootstrap.min.js"></script>
    <script src="resource/uipackage/uiTheme.js"></script>
    <script src="resource/js/jquery.blockui.js"></script>
    <script src="resource/js/jquery.cookie.js"></script>
    <script src="resource/js/common.js"></script>

    <script src="resource/library/uniform/jquery.uniform.min.js"></script>
    <script src="resource/library/gritter/js/jquery.gritter.min.js"></script>
    <script src="resource/js/jquery.pulsate.min.js"></script>
    <script src="resource/js/app.js"></script>
    <script src="resource/js/securecloud.js"></script>
    <script src="resource/js/jquery.number.min.js"></script>
    <script src="resource/library/JSPinyin/pinyin.js"></script>
    <script>
        var userId = getCookie('userId');
        if (userId === '' || userId === null) {
            alert('获取用户Id失败，请检查浏览器Cookie是否已启用');
            logOut();
        }
        if (getCookie('orgId') === "116") {
            $("#EngineeringLog").css("display", "block");
        } else {
            $("#EngineeringLog").css("display", "none");
        }
        if (getCookie('portal') == "U") { // User
            $('.enterManage').html('<li><a href="/account.aspx"><i class="icon-user"></i>账户</a></li>'
                + '<li class="divider"></li>'
                + '<li><a id="btnLogout" href="javascript:logOut();"><i class="icon-key"></i>退出</a></li>');
        } else { // Manager
            $('.enterManage').html(' <li><a href="#" onclick="enterManageInterface()"><i class="icon-refresh"></i>进入管理侧</a></li>'
               + '<li class="divider"></li>'
               + '<li><a href="/account.aspx"><i class="icon-user"></i>账户</a></li>'
               + '<li class="divider"></li>'
               + '<li><a id="btnLogout" href="javascript:logOut();"><i class="icon-key"></i>退出</a></li>');
        }
    </script>

    <script src="resource/library/highcharts/highcharts.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=wEiighBCdHAkOrXRHDsqlgW5"></script>
    
	<%
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
    %>
    <script type="text/javascript" src="<%=gisScriptPath%>"></script>
    
    <script src="resource/js/DisplayWeather.js"></script>
    <script src="resource/js/alarmBadge.js"></script>
    <script src="resource/js/index.js"></script>
   
    <script type="text/javascript">
        jQuery(document).ready(function () {
            var color = getCookie('color');
            if (color != '' && color != null) {
                $('#style_color').attr("href", "resource/css/style_" + color + ".css");
            }
            App.setPage("index");  // set current page
            App.init(); // init the rest of plugins and elements

            $('#struct-menu,#systemConfig,#manage,#hotspotBU').click(function () {
                $('.has-sub').removeClass('active');
                $(this).addClass('active');
            });
        });
    </script>
    <script src="resource/js/downLoadReport.js"></script>
    <script src="resource/library/bootstrap/js/bootstrap-tooltip.js"></script>
</body>
</html>