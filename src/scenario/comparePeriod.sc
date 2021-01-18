theme: /

    
    state: СравнениеПоГодам
        q!: (сравн*/соотнес*/сдела* сравнени*/сравнени*) [по] (год*)
        script:
            compareYears($context);
        go!: /СравниваемПоГодам
        
    state: СравнениеТекущегоГода
        q!: (сравн*/соотнес*/сдела* сравнени*/сравнени*) (текущ*/это*) (год*)
        script:
            compareYear($context);
        go!: /СравниваемТекущийГод
        
        
    state: СравнениеПолугодия
        intent!: /СравнениеПолугодия
        script: 
            var $HalfYear = $parseTree.value;
            compareHalfYear($HalfYear, $context);
        
        
    state: СравнениеКвартала
        intent!: /СравнениеКвартала
        script: 
            var $Quarter;
            if (typeof $parseTree.value === "object") {
                $Quarter = $parseTree.value.month - 1;
            } else {
                var $QuarterDictionary = {
                    "1": 0,
                    "2": 3,
                    "3": 6,
                    "4": 9
                  };
                $Quarter = $QuarterDictionary[$parseTree.value];
            }
            compareQuarter($Quarter, $context);

    state: СравнениеМесяца
        intent!: /СравнениеМесяца
        script: 
            var $Month;
            if (typeof $parseTree.value === "object") {
                $Month = $parseTree.value.month - 1;
            } else {
                $Month = $parseTree.value - 1;
            }
            compareMonth($Month, $context);
            
    state: ВыделениеМесяца
        intent!: /ВыделениеМесяца
        script: 
            var $Month;
            if (typeof $parseTree.value === "object") {
                $Month = $parseTree.value.month - 1;
            } else {
                $Month = $parseTree.value - 1;
            }
            selectMonth($Month, $context);

        
        