$(document).ready(function () {
    let max = document.getElementById('max-price');
    $('#slider').change(function () {
        max.innerHTML = this.value;
    });

    let link_1Element = document.getElementById('link-1');
    let link_2Element = document.getElementById('link-2');
    let link_3Element = document.getElementById('link-3');

    let link1Element = document.getElementById('link1');
    let link2Element = document.getElementById('link2');
    let link3Element = document.getElementById('link3');

    let price1Element = document.getElementById('price1');
    let price2Element = document.getElementById('price2');
    let price3Element = document.getElementById('price3');

    let priceValue1Element = document.getElementById('price_value1');
    let priceValue2Element = document.getElementById('price_value2');
    let priceValue3Element = document.getElementById('price_value3');

    


    let link12Element = document.getElementById('link1_2');
    let link22Element = document.getElementById('link2_2');
    let link32Element = document.getElementById('link3_2');

    let price12Element = document.getElementById('price1_2');
    let price22Element = document.getElementById('price2_2');
    let price32Element = document.getElementById('price3_2');

    let priceValue12Element = document.getElementById('price_value1_2');
    let priceValue22Element = document.getElementById('price_value2_2');
    let priceValue32Element = document.getElementById('price_value3_2');

    let link_12Element = document.getElementById('link-1-2');
    let link_22Element = document.getElementById('link-2-2');
    let link_32Element = document.getElementById('link-3-2');


    let websiteElement = document.getElementById('website');
    let priceHotelElement = document.getElementById('price-hotel');
    let priceHotelNightsElement = document.getElementById('price-hotel-nights');


    let website2Element = document.getElementById('website2');
    let priceHotel2Element = document.getElementById('price-hotel2');
    let priceHotelNights2Element = document.getElementById('price-hotel-nights2');

    let text;

    link_1Element.addEventListener("click", function (e) {

        websiteElement.innerHTML = link1Element.innerHTML;
        priceHotelElement.innerHTML = price1Element.innerHTML;
        priceHotelNightsElement.innerHTML = 3 * parseInt(priceValue1Element.innerHTML);
        text = '$';
        text = text + 3 * parseInt(priceValue1Element.innerHTML);
        priceHotelNightsElement.innerHTML = text;


    });

    link_2Element.addEventListener("click", function (e) {

        websiteElement.innerHTML = link2Element.innerHTML;
        priceHotelElement.innerHTML = price2Element.innerHTML;
        priceHotelNightsElement.innerHTML = 3 * parseInt(priceValue2Element.innerHTML);
        text = '$';
        text = text + 3 * parseInt(priceValue2Element.innerHTML);
        priceHotelNightsElement.innerHTML = text;


    });

    link_3Element.addEventListener("click", function (e) {
        websiteElement.innerHTML = link3Element.innerHTML;
        priceHotelElement.innerHTML = price3Element.innerHTML;
        text = '$';
        text = text + 3 * parseInt(priceValue3Element.innerHTML);
        priceHotelNightsElement.innerHTML = text;

    });


    link_12Element.addEventListener("click", function (e) {

        website2Element.innerHTML = link12Element.innerHTML;
        priceHotel2Element.innerHTML = price12Element.innerHTML;
        priceHotelNights2Element.innerHTML = 3 * parseInt(priceValue12Element.innerHTML);
        text = '$';
        text = text + 3 * parseInt(priceValue12Element.innerHTML);
        priceHotelNights2Element.innerHTML = text;


    });

    link_22Element.addEventListener("click", function (e) {
        website2Element.innerHTML = link22Element.innerHTML;
        priceHotel2Element.innerHTML = price22Element.innerHTML;
        priceHotelNights2Element.innerHTML = 3 * parseInt(priceValue22Element.innerHTML);
        text = '$';
        text = text + 3 * parseInt(priceValue22Element.innerHTML);
        priceHotelNights2Element.innerHTML = text;

    });

    link_32Element.addEventListener("click", function (e) {
        website2Element.innerHTML = link32Element.innerHTML;
        priceHotel2Element.innerHTML = price32Element.innerHTML;
        priceHotelNights2Element.innerHTML = 3 * parseInt(priceValue32Element.innerHTML);
        text = '$';
        text = text + 3 * parseInt(priceValue32Element.innerHTML);
        priceHotelNights2Element.innerHTML = text;


    });

    
    // let today = new Date();
    // let tomorrow = new Date();
    // tomorrow.setDate(tomorrow.getDate() + 1);
    
    // document.querySelector("#check-in").valueAsDate = today;
    // document.querySelector("#check-out").valueAsDate = tomorrow;
  


    // $('#check-in').datepicker({
    //     onSelect: function(dateText, inst) {
    //         //Get today's date at midnight
    //         var today = new Date();
    //         today = Date.parse(today.getMonth()+1+'/'+today.getDate()+'/'+today.getFullYear());
    //         //Get the selected date (also at midnight)
    //         var selDate = Date.parse(dateText);

    //         if(selDate < today) {
    //             //If the selected date was before today, continue to show the datepicker
    //             $('#Date').val('');
    //             $(inst).datepicker('show');
    //         }
    //     }
    // });



});