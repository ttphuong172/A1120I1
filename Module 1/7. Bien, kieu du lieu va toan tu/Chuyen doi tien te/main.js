document.getElementById('btnconvert').addEventListener('click',convert)
function convert() {
    var amount = document.getElementById('amount').value;
    var fromCurrency = document.getElementById('fromcurrency').value;
    var toCurrency = document.getElementById('tocurrency').value;
    var denominationsUSD=23000;
    var result;
     if (fromCurrency === 'vietnam'){
        if (toCurrency==='vietnam'){
            result = 'Vui long chon lai'
        }
        else{
            result = parseFloat(amount) / denominationsUSD;
        }
    }
    else if (fromCurrency==='usd'){
        if (toCurrency==='usd'){
            result = 'Vui long chon lai'
        }
        else{
            result = parseFloat(amount) * denominationsUSD;
        }
    }

    document.getElementById('result').innerHTML = result;
}