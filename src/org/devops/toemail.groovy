package org.devops

def Email(status,user){
    mail to: "huangjuanzi@zhisoutech.com",
    subject: "流水线邮件",
    body: """ 
    构建信息：
        项目名称：${JOB_NAME}        
        <li>构建编号：${BUILD_ID}</li>
        构建状态: ${status}
       <li>项目地址：<a href="${BUILD_URL}">${BUILD_URL}</a></li>  
        构建日志：<a href="${BUILD_URL}console">${BUILD_URL}console</a> """
}
