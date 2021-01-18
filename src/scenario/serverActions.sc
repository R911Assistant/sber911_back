# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /

    state: Неудача
        event!: fail
        event!: FAIL

        random: 
            a: Не могу выполнить
            a: Не получается

           
    state: ПереходимНаСтраницу
        event!: go_to
        event!: GO_TO

        random: 
            a: Перехожу
           
            
    state: ПереходимНаСледующуюСтраницу
        event!: go_next
        event!: GO_NEXT

        random: 
            a: Перехожу 
            
    state: ПереходимНаПредыдущуюСтраницу
        event!: go_prev
        event!: GO_PREV

        random: 
            a: Перехожу
            
    state: ПереходимКРазделу
        event!: go_to_anchor
        event!: GO_TO_ANCHOR
        random:
            a: Перехожу к разделу
    
    
    
    state: СравниваемПоГодам
        event!: compare_years
        event!: COMPARE_YEARS
        random:
            a: Сравниваю по годам
            
    state: СравниваемТекущийГод
        event!: compare_year
        event!: COMPARE_YEAR
        random:
            a: Сравниваю текущий год
            
    state: СравниваемПолугодие
        event!: compare_half_year
        event!: COMPARE_HALF_YEAR
        random:
            a: Сравниваю полугодие
           
    state: СравниваемКвартал
        event!: compare_quarter
        event!: COMPARE_QUARTER
        random:
            a: Сравниваю квартал
            
    state: СравниваемМесяц
        event!: compare_month
        event!: COMPARE_MONTH
        random:
            a: Сравниваю месяц
            
    state: ВыделяемМесяц
        event!: select_month
        event!: SELECT_MONTH
        random:
            a: Выделяю месяц
            
            
                       
    state: МасштабируемГод
        event!: zoom_year
        event!: ZOOM_YEAR
        random:
            a: Масштабирую год
            
            
            
            
    state: ВыделяемСерию
        event!: select_series
        event!: SELECT_SERIES
        random:
            a: Выделяю серию
            
    state: ВыделяемВсеСерии
        event!: select_all_series
        event!: SELECT_ALL_SERIES
        random:
            a: Выделяю все серии
            
            
            
            
    state: ПоказываемСледующееВнедрение
        event!: show_next_integration
        event!: SHOW_PREV_INTEGRATION
        random:
            a: Показываю следующее внедрение
            
            
    state: ПоказываемПредыдущееВнедрение
        event!: show_prev_integration
        event!: SHOW_PREV_INTEGRATION
        random:
            a: Показываю предыдущее внедрение
            
            
            
    state: Отменяем
        event!: cancel
        event!: CANCEL
        random:
            a: Отменяю