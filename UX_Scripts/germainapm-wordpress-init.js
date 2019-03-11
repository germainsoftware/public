GermainAPM.init({
    beacon_url: 'http://${domain}/ingestion/beacon',
    AsyncMonitoring: { enabled : true},
    RT: {enabled : true}, 
    IframeMonitoring: {enabled : true},
    WebSocketMonitoring: {enabled : false},
    ClickMonitoring: {enabled: true, frameMonitoringEnabled: true, fullMonitoringEnabled: true, eventInit: "page_ready"},
    FocusMonitoring: {enabled: true, pushInterval: 15, eventInit: "page_ready"},
    InputMonitoring: {enabled: true},
    MouseMonitoring: {enabled: true, frameMonitoringEnabled: true, snapshotInterval: 100, 
        pushInterval: 15, eventInit: "page_ready"},
    ChangeMonitoring: {enabled : true, eventInit: "page_ready"},
    KeyboardMonitoring: {enabled : true, eventInit: "page_ready"},
    MemoryMonitoring: {enabled: true},
    InactivityMonitoring: {enabled: true, eventInit: "page_ready", threshold: 30},
    VisibilityMonitoring: {enabled: true},
    StaticResourcesMonitoring: {enabled: true, eventInit: "page_ready", cssMonitoringEnabled: true, 
         cssParsingEnabled: true, imagesMonitoringEnabled: true, cacheEnabled: true},
    ScrollMonitoring: {enabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ResizeMonitoring: {enabled: true, eventInit: "dom_loaded"},
    DomMonitoring: {enabled: true, eventInit: "page_ready", pushInterval: 5, pushFullInterval: 30, changesCountToSendFullBody: 250, dataTimeout: 30000}
},{
    USE_AJAX: true, // if true then send all data using Ajax requests
    DATA_QUEUE: {
        enabled: true, // if true then send all data points to the data queue
        pushInterval: 5, // if USE_DATA_QUEUE=true then this value says how often should we send data from the queue back to apm (in seconds)
        queue: [] // storage placeholder
    },
    CONSOLE_MONITORING: true, // enable console warning and error monitoring
    ALERT_MONITORING: true, // enable window.alert warning and error messages
    REQUEST_BODY_MONITORING : true, // catch request body 
    REQUEST_BODY_MONITORING_SIZE_LIMIT: 7000, // limit body size (in chars length)
    URL_TITLE : function(_document){ return _document['title']; } ,
    DATA_TIMEOUT : 5000, // how long we can try to send collect data back (in ms)
    CUMULATIVE_TXN_MONITORING: {
        count: 1,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current cumulative txn and send current cum. txn
        hierarchyId: new Date().getTime() + Math.random().toString(36).substring(6),
        excludeUrls: []
    },
    EXCLUDE_URLS: []
},{
    appName : 'Wordpress',
    username : '<default>',
    session: BOOMR.utils.session.getSessionId,
    cid: BOOMR.utils.session.getSessionId
});
