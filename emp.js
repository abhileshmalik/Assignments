emplist=[

    {
    name:'abhilesh',
    age:21,
    salary:1000,
    dob:'21/3/1998'
},
{
    name:'abc',
    age:19,
    salary:10000,
    dob:'28/1/2001'
},
{
    name:'xyz',
    age:50,
    salary:500,
    dob:'17/6/1996'
    }

];
document.write("<b>Ques 1</b>")
document.write("<br>");
var i;
for(i in emplist)
{
    if(emplist[i].salary>5000)
    {
        document.write("Salary greater tham 5000-> "+emplist[i].name+emplist[i].salary)
        document.write("<br>");
    }
}
document.write("<b>Ques 2</b>")
document.write("<br>");
for(i in emplist)
{
    if(emplist[i].age<20)
    {
        document.write("\n age less than 20:"+emplist[i].name);
        document.write("<br>");
    }

    if(emplist[i].age>20&&emplist[i].age<40)
    {
        document.write("\n age between 20 and 40:\n "+emplist[i].name);
        document.write("<br>");
    }
    if(emplist[i].age>40&&emplist[i].age<100)
    {
        document.write("age between 40 and 100 \n"+emplist[i].name);
        document.write("<br>");
    }

}
document.write("<b>Ques 3</b>")
document.write("<br>");

for(i in emplist) {
    if(emplist[i].salary<1000&&emplist[i].age>20)
    {
        document.write("Name="+emplist[i].name)
        document.write("<br>");

        document.write("Salary="+emplist[i].salary)
        document.write("<br>");

        emplist[i].salary=emplist[i].salary*5;


        document.write("New Salary="+emplist[i].salary)
        document.write("<br>");
    }
}