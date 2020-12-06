
function convert() {
    var amount = document.getElementById('amount').value;
    var result = parseFloat(amount)/23000;
    document.getElementById('result').innerHTML=result;
}