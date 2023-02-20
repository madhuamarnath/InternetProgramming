console.log(JSON.stringify({ x: 5 }));        	    
console.log(JSON.stringify(true));            	    
console.log(JSON.stringify('foo'));           	    
console.log(JSON.stringify(new Date(1950,11,12,23,49,00))); 

const student = '{"regno":4100, "name":"Rahul", "cgpa":9.72, "dept":"CSE"}';
const obj = JSON.parse(student);
console.log(obj);