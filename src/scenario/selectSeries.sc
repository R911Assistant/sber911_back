theme: /

    state: ВыделениеСерии
        q!: {(видел*/выдел*/выбер*/выбор/выбра*) (сери*/уровен*)
            $AnyText::anyText}
            
        script:
            selectSeries($parseTree._anyText, $context);
        
        
    state: ВыделениеВсехСерий
        q!:  {(видел*/выдел*/выбер*/выбор/выбра*) (все* сери*)}
        
        script:
            selectAllSeries($context);
        
        go!: /ВыделяемВсеСерии