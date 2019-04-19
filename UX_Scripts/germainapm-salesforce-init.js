GermainAPM.init({
    beacon_url: 'https://${domain}/ingestion/beacon',
    AsyncMonitoring: {enabled : true, queryStringGenerator: GermainAPMSalesforceUtils.xhrQueryStringGenerator, taggingEnabled: false},
    FetchMonitoring: {enabled: true},
    RT: {enabled : true}, 
    IframeMonitoring: {enabled : false},
    ClickMonitoring: {enabled: true, fullMonitoringEnabled: true, frameMonitoringEnabled: false, 
        clickContainerLookup: GermainAPMSalesforceUtils.clickContainerLookup, eventInit: "page_ready"},
    FocusMonitoring: {enabled: true, pushInterval: 15, eventInit: "page_ready"},
    InputMonitoring: {enabled: true},
    MouseMonitoring: {enabled: true, frameMonitoringEnabled: true, snapshotInterval: 100, 
        pushInterval: 15, eventInit: "page_ready"},
    ChangeMonitoring: {enabled : true, eventInit: "page_ready"},
    KeyboardMonitoring: {enabled : true, eventInit: "page_ready"},
    MemoryMonitoring: {enabled: true, eventInit: "page_ready"},
    InactivityMonitoring: {enabled: true, eventInit: "page_ready", threshold: 30},
    VisibilityMonitoring: {enabled: true, eventInit: "page_ready"},
    StaticResourcesMonitoring: {enabled: true, eventInit: "page_ready", cssMonitoringEnabled: true, 
         cssParsingEnabled: true, imagesMonitoringEnabled: true, cacheEnabled: true},
    ScrollMonitoring: {enabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ResizeMonitoring: {enabled: true, eventInit: "dom_loaded"},
    DomMonitoring: {enabled: true, eventInit: "page_ready", pushInterval: 5, pushFullInterval: 30,
        changesCountToSendFullBody: 100, dataTimeout: 30000},
    PopupDialogMonitoring: {enabled: true},
    ConsoleMonitoring: {enabled: true}
},{
    DATA_QUEUE_PUSH_INTERVAL: 5,
    SEND_SYNC_ON_UNLOAD: true, // this only applies when the navigator.sendBeacon is unavailable (IE)
    REQUEST_BODY_MONITORING: true, // catch POST request body
    RESPONSE_BODY_MONITORING: true, // catch response body 
    RESPONSE_BODY_PARSER: null,
    PAGE_TITLE: GermainAPMSalesforceUtils.titleLookup, // extract request title
    DATA_TIMEOUT: 10000, // how long we can try to send collect data back (in ms)
    USER_CLICK: {
        count: 0,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current user click txn and send current cum. txn
        sequence: new Date().getTime() + Math.random().toString(36).substring(6),
        queryStringGenerator: GermainAPMSalesforceUtils.userClickQueryStringGenerator, // user click txn query string extractor
        excludeUrls: [
            /cometd\/replay/
        ]
    },
    EXCLUDE_URLS: [ 
        /cometd\/replay/
    ]
},{
    appName: 'Salesforce',
    username: GermainAPMSalesforceUtils.usernameLookup,
    session: GermainAPMSalesforceUtils.sessionLookup,
    cid: GermainAPMSalesforceUtils.sessionLookup
});
