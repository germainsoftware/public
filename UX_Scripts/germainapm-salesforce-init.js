GermainAPM.init({
    beacon_url: 'http://${domain}/ingestion/beacon',
    AsyncMonitoring: {enabled : true, queryStringGenerator: GermainAPMSalesforceUtils.xhrQueryStringGenerator},
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
    MemoryMonitoring: {enabled: true, repeatSeconds: 120, eventInit: "page_ready"},
    InactivityMonitoring: {enabled: true, eventInit: "page_ready", threshold: 30},
    VisibilityMonitoring: {enabled: true, eventInit: "page_ready"},
    StaticResourcesMonitoring: {enabled: true, eventInit: "page_ready", cssMonitoringEnabled: true, 
         cssParsingEnabled: true, imagesMonitoringEnabled: true, cacheEnabled: true},
    ScrollMonitoring: {enabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ResizeMonitoring: {enabled: true, eventInit: "dom_loaded"},
    DomMonitoring: {enabled: true, eventInit: "page_ready", pushInterval: 5, pushFullInterval: 30,
        changesCountToSendFullBody: 100, dataTimeout: 30000}
},{
    USE_AJAX: true, // if true then send all data using Ajax requests
    DATA_QUEUE: {
        enabled: true, // if true then send all data points to the data queue
        pushInterval: 5, // if USE_DATA_QUEUE=true then this value says how often should we send data from the queue back to apm (in seconds)
        queue: [] // storage placeholder
    },
    CONSOLE_MONITORING: true, // enable console warning and error monitoring
    ALERT_MONITORING: true, // enable window.alert warning and error messages
    REQUEST_BODY_MONITORING: true, // catch POST request body
    REQUEST_BODY_MONITORING_SIZE_LIMIT: 7000, // limit body size (in chars length)
    URL_TITLE: GermainAPMSalesforceUtils.titleLookup, // extract request title
    DATA_TIMEOUT: 10000, // how long we can try to send collect data back (in ms)
    CUMULATIVE_TXN_MONITORING: {
        count: 1,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current cumulative txn and send current cum. txn
        category: 'HTTP:Salesforce Page View', // cumulative txn name
        hierarchyId: new Date().getTime() + Math.random().toString(36).substring(6),
        queryStringGenerator: GermainAPMSalesforceUtils.cumulativeQueryStringGenerator, // cumulative txn query string extractor
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
