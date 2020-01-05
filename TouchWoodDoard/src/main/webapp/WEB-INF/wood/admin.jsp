<%--
  Created by IntelliJ IDEA.
  User: MI
  Date: 2019/12/24 0024
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>鑫鑫木业管理系统(管理页面)</title>

    <%--<link href="./easyUI/Css/default.css" rel="stylesheet" type="text/css" />--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wood/easyUI/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wood/easyUI/themes/icon.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/wood/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/wood/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src='${pageContext.request.contextPath}/wood/js/outlook2.js'> </script>
    <script type="text/javascript">
        var _menus = {"menus":[
                {"menuid":"1","icon":"icon-sys","menuname":"常规设置",
                    "menus":[
                        {"menuid":"2","menuname":"所有订单管理","icon":"icon-add","url":"/templatewood"},
                        {"menuid":"3","menuname":"木方订单管理","icon":"icon-users","url":"WEB-INF/wood/wood.jsp"},
                        {"menuid":"4","menuname":"摸板订单管理","icon":"icon-role","url":"WEB-INF/wood/template.jsp"}
                    ]
                },{"menuid":"6","icon":"icon-sys","menuname":"财务管理",
                    "menus":[{"menuid":"7","menuname":"收支分类","icon":"icon-nav","url":"demo.html"},
                        {"menuid":"8","menuname":"报表统计","icon":"icon-nav","url":"demo1.html"},
                        {"menuid":"9","menuname":"添加支出","icon":"icon-nav","url":"demo2.html"}
                    ]
                }
            ]};


    </script>
</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">

<noscript>
    <div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
        <img src="images/noscript.gif" alt='抱歉，请开启脚本支持！' />
    </div></noscript>
<div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
    <span style="padding-left:10px; font-size: 16px; "><img src="${pageContext.request.contextPath}/wood/images/blocks.gif" width="20" height="20" align="absmiddle" />&nbsp;后台管理系统</span>
</div>
<div region="west" hide="true" split="true" title="导航菜单" style="width:180px;" id="west">
    <div id="nav" class="easyui-accordion" fit="true" border="false">
        <!--  导航内容 -->

    </div>

</div>
<div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
    <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
        <div title="欢迎使用" style="padding:20px;overflow:hidden; color:red; " >
            <center><h1>欢迎使用鑫鑫木业管理系统</h1></center>
        </div>
    </div>
</div>
</body>
</html>
