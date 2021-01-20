theme: /

    state: ПереходНаДашбордГруппы
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [дашборд*/отсчет*/] [групп*] ($AnyText::anyText)
            
        script:
            goToGroupDasbord($parseTree._anyText, $context);
            