<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="Content-Style-Type" content="text/css"/>
    <title></title>
    <style type="text/css">
        body {
            font-family: pingfang sc light;
        }
        .center{
            text-align: center;
            width: 100%;
        }
    </style>
</head>
<body>
 

<div class="page" >
    <p><font color='red'>说明：带有绿色的问题选项即当前问题的答案。</font></p>
     <p>${clientName},您好,你的适当性试题答卷情况如下：</p>
     <#list qas as item>
          <p>${item.idx}、${item.qCotent}</p>
          <#list item.opts as opt >
             <#if opt.idx=item.qAnswer> <p>&nbsp;&nbsp;&nbsp;&nbsp;<font color='green'>${opt.idx}、${opt.desc}</font></p></#if>
             <#if opt.idx!=item.qAnswer><p>&nbsp;&nbsp;&nbsp;&nbsp;${opt.idx}、${opt.desc}</p></#if>
          </#list>
    </#list>
</div>
</body>
</html>