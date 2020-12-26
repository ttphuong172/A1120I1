function kangaroo(x1, v1, x2, v2) {
    var result;
    if ((x2-x1)>0 && (v1-v2)>0 && (x2-x1)%(v1-v2)===0) {
        result='YES';
    } else{
        result='NO';
    }
//console.log(result)
    return result;
}