var http=require('http');

http.createServer((req,resp)=>{
    resp.writeHead(200,{'ContentType':'text/html'})
    resp.write('<br>hello world');
    ar=["delhi","chennai","kolkotta","mumbai","banglore","pune"]
    resp.write('<ol>')
    ar.forEach(element => {
        resp.write("<li>"+element)
    });
    
    resp.write('</ol>')
    resp.write('my clock')
    
    resp.end('<br>end of message');
}).listen(8001);
console.log('server is running');