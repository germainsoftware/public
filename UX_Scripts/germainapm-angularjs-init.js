GermainAPM.init({
    beacon_url: 'https://${domain}/ingestion/beacon',
    AsyncMonitoring : {enabled: true, taggingEnabled: false},
    RT: {enabled: true}, 
    IframeMonitoring: {enabled: true},
    WebSocketMonitoring: {enabled: true},
    ClickMonitoring: {enabled: true, frameMonitoringEnabled: true, fullMonitoringEnabled: true, eventInit: "page_ready"},
    FocusMonitoring: {enabled: true, pushInterval: 15, eventInit: "page_ready"},
    InputMonitoring: {enabled: true},
    MouseMonitoring: {enabled: true, frameMonitoringEnabled: true, snapshotInterval: 100, 
        pushInterval: 5, eventInit: "page_ready"},
    ChangeMonitoring: {enabled: true, eventInit: "page_ready"},
    KeyboardMonitoring: {enabled: true, eventInit: "page_ready"},
    MemoryMonitoring: {enabled: true, eventInit: "page_ready"},
    InactivityMonitoring: {enabled: true, eventInit: "page_ready", threshold: 30},
    VisibilityMonitoring: {enabled: true},
    StaticResourcesMonitoring: {enabled: true, eventInit: "page_ready", cssMonitoringEnabled: true, 
         cssParsingEnabled: true, imagesMonitoringEnabled: true, cacheEnabled: true},
    ScrollMonitoring: {enabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ResizeMonitoring: {enabled: true, eventInit: "dom_loaded"},
    DomMonitoring: {enabled: true, eventInit: "page_ready", pushInterval: 5, 
        changesCountToSendFullBody: 750, dataTimeout: 30000},
    ConsoleMonitoring: {enabled: true}
},{
    DATA_QUEUE_PUSH_INTERVAL: 5,
    SEND_SYNC_ON_UNLOAD: true, // this only applies when the navigator.sendBeacon is unavailable (IE)
    REQUEST_BODY_MONITORING : true, // catch request body 
    RESPONSE_BODY_MONITORING: true, // catch response body 
    RESPONSE_BODY_PARSER: null,
    PAGE_TITLE: function(_document){ return _document['title']; } ,
    DATA_TIMEOUT: 10000, // how long we can try to send collect data back (in ms)
    USER_CLICK: {
        count: 0,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current user click txn and send current cum. txn
        sequence: new Date().getTime() + Math.random().toString(36).substring(6),
        excludeUrls: []
    },
    EXCLUDE_URLS: []
},{
    appName: 'AngularJS',
    username: '<default>',
    session: BOOMR.utils.session.getSessionId,
    cid: BOOMR.utils.session.getSessionId
});
