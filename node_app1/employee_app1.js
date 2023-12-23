var employee=require('./data/employee');
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

app.get("/all/:eid",(req,resp)=>{
   console.log(' employee search  method  using id ')
   if(!req.params.eid ||isNaN(req.params.eid) ){
   return resp.status(404).send('invalid id  or not a number')
   }

   var e=employee.find((a)=>{
    return a.id===parseInt(req.params.eid)
   })
 if(!e){
    return resp.status(404).send('id is not found')
 }

  return  resp.status(201).send(e);
});


app.listen(1000);
