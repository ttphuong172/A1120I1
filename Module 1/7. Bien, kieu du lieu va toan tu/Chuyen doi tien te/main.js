document.getElementById('btnconvert').addEventListener('click',convert)
function convert() {
    var amount = document.getElementById('amount').value;
    var fromCurrency = document.getElementById('fromcurrency').value;
    var toCurrency = document.getElementById('tocurrency').value;
    var denominationsUSD=23000;
    var denominationsPound=30793;
    var result;
     if (fromCurrency === 'vietnam'){
        if (toCurrency==='vietnam'){
            result = 'Vui long chon lai'
        }
        else if (toCurrency==='usd'){
            result = parseFloat(amount) / denominationsUSD;
        }
        else if (toCurrency==='pound'){
            result = parseFloat(amount) / denominationsPound;
        }
    }
    else if (fromCurrency==='usd'){
        if (toCurrency==='usd'){
            result = 'Vui long chon lai'
        }
        else if (toCurrency==='vietnam') {
            result = parseFloat(amount) * denominationsUSD;
        }
        else if (toCurrency==='pound') {
            result = parseFloat(amount) * (denominationsUSD/denominationsPound);
        }
    }
    else if (fromCurrency==='pound'){
         if (toCurrency==='vietnam'){
             result=amount*denominationsPound;
         }
         else if(toCurrency==='usd'){
             result=amount*(denominationsPound/denominationsUSD)
         }
         else if (toCurrency==='pound'){
             result='Vui long chon lai'

         }
     }

    document.getElementById('result').innerHTML = result;
}