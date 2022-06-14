package org.devops

def Email(){
    emailext body: ''' <p>项目名称：${JOB_NAME}</p>         
                       <p>构建编号：${BUILD_ID}</p>                        
                       <p>项目地址：<a href="${BUILD_URL}">${BUILD_URL}</a></p>    
                       <p>构建日志：<a href="${BUILD_URL}console">${BUILD_URL}console</a></p>''',subject: '构建结束', to: 'huangjuanzi@zhisoutech.com'  
}
