function gradingStudents(grades) {
    // Write your code here

    for(let i=0;i<grades.length;i++){
        if(grades[i]<38){
            grades[i]=grades[i]
        } else{
            if(grades[i]%5>2){
                grades[i]=(Math.floor(grades[i]/5)+1)*5
            } else{
                grades[i]=grades[i]
            }
        }
    }
    return grades
}

gradingStudents([73,67,38,33])