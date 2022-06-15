package org.devops

def Email(status,user){
    mail to: "huangjuanzi@zhisoutech.com",
    subject: '流水线邮件',
    mimeType: 'text/html',
    body: """ 
    构建信息：
        项目名称："${JOB_NAME}"        
        构建编号：${BUILD_ID}
        构建状态: ${status}
        """
}
