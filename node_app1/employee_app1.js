var employee=require('./data/employee.js');
var express=require('express')
var app=express();
app.use(express.json())

app.get("/",(req,resp)=>{
   resp.write('<h1>Employee Program</h1>')
   console.log('get method with  root (/) path  ')
   resp.end();
});

app.get("/all",(req,resp)=>{
   console.log('all employee get method ')
   resp.json(employee);
});


app.listen(1000);
