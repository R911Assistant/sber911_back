theme: /

    state: ПереходКЭлементу
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к] [дашборд*/отсчет*/отчет*/dashboard/групп*] ($AnyText::anyText)
            
        script:
            goToElement($parseTree._anyText, $context);
            
            