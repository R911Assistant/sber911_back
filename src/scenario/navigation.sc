theme: /

    state: ПереходНаДашбордГруппы
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [дашборд*/отсчет*] [групп*/категор*] ($AnyText::anyText)
            
        script:
            goToGroupDasbord($parseTree._anyText, $context);
            