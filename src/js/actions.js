function openIndustry(value, context) {
    addAction({
        type: "open_industry",
        value: value
    }, context);
}

function openElement(value, context) {
    addAction({
        type: "open_element",
        value: value
    }, context);
}

function openSomething(value, context) {
    addAction({
        type: "open_something",
        value: value
    }, context);
}

function closeCurrent(context) {
    addAction({
        type: "close",
    }, context);
}


function play(context) {
    addAction({
        type: "play",
    }, context);
}

function pause(context) {
    addAction({
        type: "pause",
    }, context);
}


function goToElement(name, context) {
    addAction({
        type: "go_to_element",
        name: name
    }, context);
}

function goTo(place, context) {
    addAction({
        type: "go_to",
        place: place
    }, context);
}

function goToNext(context) {
    addAction({
        type: "go_next",
    }, context);
}

function goToBack(context) {
    addAction({
        type: "go_back",
    }, context);
}

function goToAnchor(anchor, context) {
    addAction({
        type: "go_to_anchor",
        anchor: anchor
    }, context);
}





function compareYears(context) {
    addAction({
        type: "compare_years",
    }, context);
}

function compareYear(context) {
    addAction({
        type: "compare_year",
    }, context);
}

function compareHalfYear(halfYear, context) {
    addAction({
        type: "compare_half_year",
        halfYear: halfYear
    }, context);
}

function compareQuarter(quarter, context) {
    addAction({
        type: "compare_quarter",
        quarter: quarter
    }, context);
}

function compareMonth(month, context) {
    addAction({
        type: "compare_month",
        month: month
    }, context);
}

function selectMonth(month, context) {
    addAction({
        type: "select_month",
        month: month
    }, context);
}




function zoomYear(year, context) {
    addAction({
        type: "zoom_year",
        year: year
    }, context);
}





function selectSeries(series, context) {
    addAction({
        type: "select_series",
        series: series
    }, context);
}

function selectAllSeries(context) {
    addAction({
        type: "select_all_series",
    }, context);
}





function showNextIntegration(context) {
    addAction({
        type: "show_next_integration",
    }, context);
}

function showPrevIntegration(context) {
    addAction({
        type: "show_prev_integration",
    }, context);
}





function cancel(context) {
    addAction({
        type: "cancel",
    }, context);
}