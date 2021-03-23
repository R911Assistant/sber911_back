theme: /

    state: ПереходККатегории
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [дашборд*/отсчет*/отчет*/dashboard/групп*] ($AnyText::anyText)
            
        script:
            goToServiceGroup($parseTree._anyText, $context);
            
            