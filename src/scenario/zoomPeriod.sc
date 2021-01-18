theme: /

    state: МасштабированиеГода
        q!:  (масштаб*/приблиз*/приближ*/увелич*/зум*) $AnyText::anyText (год*)
            
        script: 
            zoomYear($parseTree._anyText, $context);

        