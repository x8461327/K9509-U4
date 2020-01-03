<%@page pageEncoding="utf-8" contentType="text/html; utf-8"  language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>区域管理</title>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.js" language="JavaScript" type="text/javascript"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="js/jquery.easyui.min.js" language="JavaScript" type="text/javascript"></script>

    <script language="JavaScript" type="text/javascript">
        $(function(){
            //1.使用datagrid组件绑定数据
            $('#dg').datagrid({
                url:'getStreet',
                pagination:true,  //开启分页
                pageSize:3,  //初始化页大小
                pageList:[3,5,8,10,20],  //页大小选项
                toolbar:'#ToolBar', //指定工具栏
                columns:[[
                    {checkbox:true,width:100,align:'right'},
                    {field:'id',title:'编号',width:100,align:'right'},
                    {field:'name',title:'街道名称',width:100,align:'right'},
                    {field:'opt',title:'编辑|操作',width:100,align:'right',
                        formatter: function(value,row,index){
                            //返回的内容就是呈现在单元格的内容
                            //value 表示当前字段的值， row当前行的值 index表示索引
                            return "<a href='#'>修改</a> <a href='#'>删除</a>";
                        }
                    }
                ]]
            });



        });


        //打开添加窗口
        function goAdd(){
            //打开对话框
            //$("#AddDialog").dialog("open");
            $("#AddDialog").dialog("open").dialog('setTitle',"添加区域");
        }

        //关闭窗口
        function CloseDialog(){
            $("#AddDialog").dialog("close");
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
                url:"addDistrict",
                success:function(data){  //{"result":1}
                    var obj=$.parseJSON(data);   //将json字符串转化为json对象
                    if(obj.result>0){
                        //成功关闭窗口
                        $("#AddDialog").dialog("close");
                    }else{
                        //alert("sss");
                        $.messager.alert('友情提示','添加失败，请联系管理员:13260601227!','info');

                    }

                }
            });
        }


        //去打开修改的窗口
        function goUpdate(){
            //1.获取datagrid的选中行
            var selObjs=$("#dg").datagrid("getSelections");
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
                href="javascript:DeleteByFruitName()" class="easyui-linkbutton"
                iconCls="icon-remove" plain="true">删除</a>
    </div>
</div>

<!--添加窗口-->
<div id="AddDialog" class="easyui-dialog" buttons="#AddDialogButtons"
     style="width: 280px; height: 250px; padding: 10px 20px;" closed="true"  modal="true">
    <form id="addDialogForm"  method="post">
        <table>
            <tr>
                <td>区域名称:</td>
                <td><input type="text" class="easyui-validatebox" required
                           name="name" id="bname" /></td>
            </tr>
        </table>
    </form>
</div>
<!--添加窗口的按钮-->
<div id="AddDialogButtons">
    <a href="javascript:SaveDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a> <a href="javascript:CloseDialog()"
                                   class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
</div>



<!--修改窗口-->
<div id="upDialog" class="easyui-dialog" buttons="#upDialogButtons"
     style="width: 280px; height: 250px; padding: 10px 20px;" closed="true"  modal="true">
    <form id="upDialogForm"  method="post">
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
    <a href="javascript:SaveDialog()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a> <a href="javascript:CloseDialog()"
                                   class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
</div>
</body>
</html>