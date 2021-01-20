theme: /

    state: ПереходНаДашбордГруппы
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [дашборд*/отсчет*/dashboard] [групп*/категор*] ($AnyText::anyText)
            
        script:
            goToServiceGroup($parseTree._anyText, $context);
            
    state: ПереходНаДашбордСервиса
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [метрик*/продукт*] ($AnyText::anyText)
            
        script:
            goToService($parseTree._anyText, $context);
            