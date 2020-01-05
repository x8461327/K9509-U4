<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="utf-8" contentType="text/html; utf-8"  language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>所有订单</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wood/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wood/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wood/easyUI/css/demo.css">
    <script src="${pageContext.request.contextPath}/wood/js/jquery-1.8.3.js" language="JavaScript" type="text/javascript"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="${pageContext.request.contextPath}/wood/js/jquery.easyui.min.js" language="JavaScript" type="text/javascript"></script>

    <script language="JavaScript" type="text/javascript">
        $(function(){
            //1.使用datagrid组件绑定数据
            $('#dg').datagrid({
                url:'/getWoodData',
                pagination:true,  //开启分页
                pageSize:20,  //初始化页大小
                pageList:[10,15,20,30,50],  //页大小选项
                toolbar:'#ToolBar', //指定工具栏
                columns:[[
                    {checkbox:true,width:100,align:'right'},
                    {field:'id',title:'编号',width:50,align:'right'},
                    {field:'time',title:'创建订单时间',width:150,align:'right'
                        // ,formatter:formatterdate,editor:{
                        //     type:'datebox',
                        //     options:{
                        //
                        //         required:true,
                        //     }
                        // }
                    },
                    {field:'productname',title:'产品',width:50,align:'right'},
                    {field:'quantity',title:'数量',width:80,align:'right'},
                    {field:'unitprice',title:'单价',width:50,align:'right'},
                    {field:'totalprices',title:'总价格',width:100,align:'right'},
                    {field:'purchaser',title:'购买人',width:60,align:'right'},
                    {field:'cellphone',title:'购买人电话',width:80,align:'right'},
                    {field:'engineeringunit',title:'工程单位',width:100,align:'right'},
                    {field:'deliveryaddress',title:'送货地址',width:100,align:'right'},
                    {field:'name',title:'售货人',width:60,align:'right'},
                    {field:'phone',title:'售货人电话',width:100,align:'right'},
                    {field:'statusname',title:'交易状态',width:100,align:'right'},
                    {field:'opt',title:'编辑|操作',width:100,align:'right',
                        formatter: function(value,row,index){
                            //返回的内容就是呈现在单元格的内容
                            //value 表示当前字段的值， row当前行的值 index表示索引
                            return "<a href='javascript:goUpdate("+row.id+")'>修改</a> <a href='javascript:delWood("+row.id+")'>删除</a>";
                        }
                    }
                ]]
            });



        });


        // function formatterdate(val) { //在外部创建一个时间转化函数 在 field 中进行调用
        //     var date = new Date(val); return date.getFullYear() + '年' + (date.getMonth() + 1) + '月' + date.getDate()+ '日    ' + (date.getHours())+ '时' + (date.getMinutes())+ '分'; }

        //打开添加窗口
        function goAdd(){
            //打开对话框
            //$("#AddDialog").dialog("open");
            $("#AddDialog").dialog("open").dialog('setTitle',"添加订单");
        }

        //关闭窗口
        function CloseDialog(youname){
            $("#"+youname).dialog("close");
        }


        //保存添加的数据     异步添加
        function SaveDialog(){
            //alert("多要保存信息，告诉我接口在哪，我去找他");
            //实现异步技术实现添加,借助ajax技术，
            //方法一:使用jquery发送异步请求
            //$.post("地址",参数，回调函数,"json")
            //将表单序列化参数数据
            /*      var param=$("#addDialogForm").serialize();
                  //console.log(param);
                   $.post("addDistrict",param,function(data){
                       if(data.result>0){
                           //成功关闭窗口
                           $("#AddDialog").dialog("close");
                       }else{
                           //alert("sss");
                           $.messager.alert('友情提示','添加失败，请联系管理员:13260601227!','info');

                       }
                   },"json");*/


            //借助easyui异步提交表单

            $('#addDialogForm').form('submit',{
                url:"addWood",
                success:function(data){  //{"result":1}
                    //var obj=$.parseJSON(data);   //将json字符串转化为json对象
                    if(data>0){
                        //成功关闭窗口
                        $.messager.alert('友情提示','添加订单成功','info');
                        $('#dg').datagrid('reload');  //刷新datagrid
                        $("#AddDialog").dialog("close");
                    }else{
                        $.messager.alert('友情提示','添加失败，请按照格式添加','info');

                    }

                }
            });
        }


        //去打开修改的窗口
        function goUpdate(){
            //1.获取datagrid的选中行
            var selObjs=$("#dg").datagrid("getSelections");
            // var ids = [];
            // $(selObjs).each(function(){
            //     ids.push(this.id);
            // });
            //console.log(ids);
            //2.验证是否选中一行
            if(selObjs.length==1){
                $("#upDialog").dialog("open").dialog('setTitle',"编辑区域");

                //还原表单数据  查询数据库，通过id获取单行记录的对象，进行回显？
                // $("#upDialogForm").form('load',json对象:{"表单对象名称":值});
                $("#upDialogForm").form('load',selObjs[0]);

            }else{
                $.messager.alert('友情提示','你可能没有选中行，获者选中多行，请选择一行修改，真他妈笨，选一行都不会','info');
            }
        }

        function updateDialog() {
            $('#upDialogForm').form('submit',{
                url:"updateDistrict",
                success:function(data){  //{"result":1}
                    //将json字符串转化为json对象
                    if(data>0){
                        $('#dg').datagrid('reload');  //刷新datagrid
                        $("#upDialog").dialog("close");   //成功关闭窗口

                    }else{
                        //alert("sss");
                        $.messager.alert('友情提示','修改失败，请联系管理员:13260601227!','info');

                    }

                }
            });
        }

        function delWood(id) {
            $.messager.defaults = {
                ok: "是", cancel: "否"
            };
            $.messager.confirm('友情提示','是否删除',function(r){
                if (r){
                    //使用jquery的post发送异步请求
                    $.post("deleteDistrict",{"id":id},function(data){
                        if(data>0){
                            $('#dg').datagrid('reload');  //刷新datagrid
                            $.messager.alert('友情提示','删除成功');
                        }else{
                            //alert("sss");
                            $.messager.alert('友情提示','删除失败，请联系管理员:15727125125','info');
                        }
                    },"json");
                }
            });
        }

        function deleteMorewood(){
            $.messager.defaults = {
                ok: "是", cancel: "否"
            };
            //1.获取datagrid的选中行
            var selObjs=$("#dg").datagrid("getSelections");
            //判断有没有选中项
            if(selObjs.length>0) {
                //确认提示框
                $.messager.confirm('友情提示', '确定要删除吗?', function (r) {
                    if (r) {  //r=true表示点击ok 否则点击取消
                        //发送异步请求调用接口实现批量删除   ids=1,2,3,4
                        //获取选中项的值id,拼接成:  值1,值2,值3
                        var str="";
                        for(var i=0;i<selObjs.length;i++){
                            str=str+selObjs[i].id+",";
                        }
                        str=str.substring(0,str.length-1);

                        //发异步请求
                        $.post("deleteMorewood",{"ids":str},function(data){
                            if(data>0){
                                //成功关闭窗口
                                $.messager.alert('友情提示','批量删除成功','info');
                                $('#dg').datagrid('reload');  //刷新datagrid
                            }else{
                                $.messager.alert('友情提示','批量删除成功，请联系管理员电话15727125125','info');

                            }
                        },"json");
                    }
                });
            }else{
                $.messager.alert('友情提示','请至少选择一条订单进行删除?','info');
            }
            $('#dg').datagrid('reload');
        }
    </script>
</head>
<body>
<!--显示区域的表格-->
<table id="dg"></table>

<!--工具栏-->
<div id="ToolBar">
    <div style="height: 40px;">
        <a href="javascript:goAdd()" class="easyui-linkbutton"
           iconCls="icon-add" plain="true">添加</a>
        <a
                href="javascript:goUpdate()" class="easyui-linkbutton"
                iconCls="icon-edit" plain="true">修改</a>
        <a
                href="javascript:deleteMorewood()" class="easyui-linkbutton"
                iconCls="icon-remove" plain="true">删除</a>
    </div>
</div>

<!--添加窗口-->
<div id="AddDialog" class="easyui-dialog" buttons="#AddDialogButtons"
     style="width: 380px; height: 320px; padding: 10px 20px;" closed="true"  modal="true">
    <form id="addDialogForm"  method="post">
        <table>
            <tr>
                <td>产品:&nbsp;&nbsp;</td>
                <td>
                    <select name="productid">
                        <c:forEach items="${products}" var="productsall">
                            <option value="${productsall.id}">${productsall.productname}</option>
                        </c:forEach>
                    </select>
                    <br>
                </td>
            </tr>

            <tr>
                <td>数量:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="quantity" placeholder="请输入数量,必须填" id="quantity"><br>
                </td>
            </tr>

            <tr>
                <td>单价  根/张:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="unitprice" placeholder="请输入单价,必须填" id="unitprice"><br>
                </td>
            </tr>

            <tr>
                <td>总价格:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="totalprices" placeholder="请输入总价格,必须填" id="totalprices"><br>
                </td>
            </tr>

            <tr>
                <td>购买人:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="purchaser" id="purchaser" placeholder="请输入购买人,必须填"><br>
                </td>
            </tr>

            <tr>
                <td>购买人电话:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="cellphone" id="cellphone" placeholder="请输入购买人电话,必须填"><br>
                </td>
            </tr>

            <tr>
                <td>工程单位:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="engineeringunit" id="engineeringunit" placeholder="请输入工程单位,必须填"><br>
                </td>
            </tr>
            <tr>
                <td>送货地址:&nbsp;&nbsp;</td>
                <td>
                    <input type="text" name="deliveryaddress" id="deliveryaddress" placeholder="请输入送货地址,必须填"><br>
                </td>
            </tr>
            <tr>
                <td>售货人:&nbsp;&nbsp;</td>
                <td>
                    <select name="seller">
                        <c:forEach items="${users}" var="userall">
                            <option value="${userall.id}">${userall.name}</option>
                        </c:forEach>
                    </select>
                    <br>
                </td>
            </tr>
            <tr>
                <td>交易状态:&nbsp;&nbsp;</td>
                <td>
                    <select name="tradingstatus">
                        <c:forEach items="${statuses}" var="statusesall">
                            <option value="${statusesall.id}">${statusesall.statusname}</option>
                        </c:forEach>
                    </select>
                    <br>
                </td>
            </tr>
        </table>
    </form>
</div>
<!--添加窗口的按钮-->
<div id="AddDialogButtons">
    <a href="javascript:SaveDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a> <a href="javascript:CloseDialog('AddDialog')"
                                   class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
</div>



<!--修改窗口-->
<div id="upDialog" class="easyui-dialog" buttons="#upDialogButtons"
     style="width: 280px; height: 250px; padding: 10px 20px;" closed="true"  modal="true">
    <form id="upDialogForm"  method="post">
        <input type="hidden" name="id">
        <table>
            <tr>
                <td>区域名称:</td>
                <td><input type="text" class="easyui-validatebox" required
                           name="name" id="bname" /></td>
            </tr>
        </table>
    </form>
</div>
<!--添加修改的按钮-->
<div id="upDialogButtons">
    <a href="javascript:updateDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a> <a href="javascript:CloseDialog('upDialog')"
                                   class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
</div>
</body>
</html>