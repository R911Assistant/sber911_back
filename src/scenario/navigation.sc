theme: /

    state: OpenIndustry
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к/на/в] (индустр*) ($AnyText::anyText)
            
        script:
            openIndustry($parseTree._anyText, $context);
            
            
    state: OpenElement
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к/на/в] (элемент*) ($AnyText::anyText)
            
        script:
            openElement($parseTree._anyText, $context);
            
    
    state: OpenSomething
        q!: (перей*/откр*/переход*/покаж*/показ*/отобраз*/выбер*/выбра*) [к/на/в] ($AnyText::anyText)
            
        script:
            openSomething($parseTree._anyText, $context);
            
    state: Close
        q!: (закро*/отмен*)
            
        script:
            closeCurrent($context);
            
                        
    state: Play
        q!: (запусти/запуск/плей/пуск)
            
        script:
            play($context);
            
            
    state: Stop
        q!: (остан*/пауза/стоп)
            
        script:
            pause($context);