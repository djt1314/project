package com.wz.domain;

import javax.persistence.*;

@Table(name = "slave_master_info")
public class SlaveMasterInfo {
    /**
     * The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    @Id
    @Column(name = "Channel_name")
    private String channelName;

    /**
     * Number of lines in the file.
     */
    @Column(name = "Number_of_lines")
    private Integer numberOfLines;

    /**
     * The master log position of the last read event.
     */
    @Column(name = "Master_log_pos")
    private Long masterLogPos;

    /**
     * The host name of the master.
     */
    @Column(name = "Host")
    private String host;

    /**
     * The network port used to connect to the master.
     */
    @Column(name = "Port")
    private Integer port;

    /**
     * The period (in seconds) that the slave will wait before trying to reconnect to the master.
     */
    @Column(name = "Connect_retry")
    private Integer connectRetry;

    /**
     * Indicates whether the server supports SSL connections.
     */
    @Column(name = "Enabled_ssl")
    private Boolean enabledSsl;

    /**
     * Whether to verify the server certificate.
     */
    @Column(name = "Ssl_verify_server_cert")
    private Boolean sslVerifyServerCert;

    @Column(name = "Heartbeat")
    private Float heartbeat;

    /**
     * Number of reconnect attempts, to the master, before giving up.
     */
    @Column(name = "Retry_count")
    private Long retryCount;

    /**
     * Indicates whether GTIDs will be used to retrieve events from the master.
     */
    @Column(name = "Enabled_auto_position")
    private Boolean enabledAutoPosition;

    /**
     * Preference to get public key from master.
     */
    @Column(name = "Get_public_key")
    private Boolean getPublicKey;

    /**
     * The name of the master binary log currently being read from the master.
     */
    @Column(name = "Master_log_name")
    private String masterLogName;

    /**
     * The user name used to connect to the master.
     */
    @Column(name = "User_name")
    private String userName;

    /**
     * The password used to connect to the master.
     */
    @Column(name = "User_password")
    private String userPassword;

    /**
     * The file used for the Certificate Authority (CA) certificate.
     */
    @Column(name = "Ssl_ca")
    private String sslCa;

    /**
     * The path to the Certificate Authority (CA) certificates.
     */
    @Column(name = "Ssl_capath")
    private String sslCapath;

    /**
     * The name of the SSL certificate file.
     */
    @Column(name = "Ssl_cert")
    private String sslCert;

    /**
     * The name of the cipher in use for the SSL connection.
     */
    @Column(name = "Ssl_cipher")
    private String sslCipher;

    /**
     * The name of the SSL key file.
     */
    @Column(name = "Ssl_key")
    private String sslKey;

    /**
     * Displays which interface is employed when connecting to the MySQL server
     */
    @Column(name = "Bind")
    private String bind;

    /**
     * The number of server IDs to be ignored, followed by the actual server IDs
     */
    @Column(name = "Ignored_server_ids")
    private String ignoredServerIds;

    /**
     * The master server uuid.
     */
    @Column(name = "Uuid")
    private String uuid;

    /**
     * The file used for the Certificate Revocation List (CRL)
     */
    @Column(name = "Ssl_crl")
    private String sslCrl;

    /**
     * The path used for Certificate Revocation List (CRL) files
     */
    @Column(name = "Ssl_crlpath")
    private String sslCrlpath;

    /**
     * Tls version
     */
    @Column(name = "Tls_version")
    private String tlsVersion;

    /**
     * The file containing public key of master server.
     */
    @Column(name = "Public_key_path")
    private String publicKeyPath;

    /**
     * ??????The channel on which the slave is connected to a source. Used in Multisource Replication
     *
     * @return Channel_name - The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * ??????The channel on which the slave is connected to a source. Used in Multisource Replication
     *
     * @param channelName The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * ??????Number of lines in the file.
     *
     * @return Number_of_lines - Number of lines in the file.
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * ??????Number of lines in the file.
     *
     * @param numberOfLines Number of lines in the file.
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * ??????The master log position of the last read event.
     *
     * @return Master_log_pos - The master log position of the last read event.
     */
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    /**
     * ??????The master log position of the last read event.
     *
     * @param masterLogPos The master log position of the last read event.
     */
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    /**
     * ??????The host name of the master.
     *
     * @return Host - The host name of the master.
     */
    public String getHost() {
        return host;
    }

    /**
     * ??????The host name of the master.
     *
     * @param host The host name of the master.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * ??????The network port used to connect to the master.
     *
     * @return Port - The network port used to connect to the master.
     */
    public Integer getPort() {
        return port;
    }

    /**
     * ??????The network port used to connect to the master.
     *
     * @param port The network port used to connect to the master.
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * ??????The period (in seconds) that the slave will wait before trying to reconnect to the master.
     *
     * @return Connect_retry - The period (in seconds) that the slave will wait before trying to reconnect to the master.
     */
    public Integer getConnectRetry() {
        return connectRetry;
    }

    /**
     * ??????The period (in seconds) that the slave will wait before trying to reconnect to the master.
     *
     * @param connectRetry The period (in seconds) that the slave will wait before trying to reconnect to the master.
     */
    public void setConnectRetry(Integer connectRetry) {
        this.connectRetry = connectRetry;
    }

    /**
     * ??????Indicates whether the server supports SSL connections.
     *
     * @return Enabled_ssl - Indicates whether the server supports SSL connections.
     */
    public Boolean getEnabledSsl() {
        return enabledSsl;
    }

    /**
     * ??????Indicates whether the server supports SSL connections.
     *
     * @param enabledSsl Indicates whether the server supports SSL connections.
     */
    public void setEnabledSsl(Boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    /**
     * ??????Whether to verify the server certificate.
     *
     * @return Ssl_verify_server_cert - Whether to verify the server certificate.
     */
    public Boolean getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    /**
     * ??????Whether to verify the server certificate.
     *
     * @param sslVerifyServerCert Whether to verify the server certificate.
     */
    public void setSslVerifyServerCert(Boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    /**
     * @return Heartbeat
     */
    public Float getHeartbeat() {
        return heartbeat;
    }

    /**
     * @param heartbeat
     */
    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    /**
     * ??????Number of reconnect attempts, to the master, before giving up.
     *
     * @return Retry_count - Number of reconnect attempts, to the master, before giving up.
     */
    public Long getRetryCount() {
        return retryCount;
    }

    /**
     * ??????Number of reconnect attempts, to the master, before giving up.
     *
     * @param retryCount Number of reconnect attempts, to the master, before giving up.
     */
    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * ??????Indicates whether GTIDs will be used to retrieve events from the master.
     *
     * @return Enabled_auto_position - Indicates whether GTIDs will be used to retrieve events from the master.
     */
    public Boolean getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    /**
     * ??????Indicates whether GTIDs will be used to retrieve events from the master.
     *
     * @param enabledAutoPosition Indicates whether GTIDs will be used to retrieve events from the master.
     */
    public void setEnabledAutoPosition(Boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    /**
     * ??????Preference to get public key from master.
     *
     * @return Get_public_key - Preference to get public key from master.
     */
    public Boolean getGetPublicKey() {
        return getPublicKey;
    }

    /**
     * ??????Preference to get public key from master.
     *
     * @param getPublicKey Preference to get public key from master.
     */
    public void setGetPublicKey(Boolean getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    /**
     * ??????The name of the master binary log currently being read from the master.
     *
     * @return Master_log_name - The name of the master binary log currently being read from the master.
     */
    public String getMasterLogName() {
        return masterLogName;
    }

    /**
     * ??????The name of the master binary log currently being read from the master.
     *
     * @param masterLogName The name of the master binary log currently being read from the master.
     */
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    /**
     * ??????The user name used to connect to the master.
     *
     * @return User_name - The user name used to connect to the master.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ??????The user name used to connect to the master.
     *
     * @param userName The user name used to connect to the master.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * ??????The password used to connect to the master.
     *
     * @return User_password - The password used to connect to the master.
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * ??????The password used to connect to the master.
     *
     * @param userPassword The password used to connect to the master.
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * ??????The file used for the Certificate Authority (CA) certificate.
     *
     * @return Ssl_ca - The file used for the Certificate Authority (CA) certificate.
     */
    public String getSslCa() {
        return sslCa;
    }

    /**
     * ??????The file used for the Certificate Authority (CA) certificate.
     *
     * @param sslCa The file used for the Certificate Authority (CA) certificate.
     */
    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    /**
     * ??????The path to the Certificate Authority (CA) certificates.
     *
     * @return Ssl_capath - The path to the Certificate Authority (CA) certificates.
     */
    public String getSslCapath() {
        return sslCapath;
    }

    /**
     * ??????The path to the Certificate Authority (CA) certificates.
     *
     * @param sslCapath The path to the Certificate Authority (CA) certificates.
     */
    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    /**
     * ??????The name of the SSL certificate file.
     *
     * @return Ssl_cert - The name of the SSL certificate file.
     */
    public String getSslCert() {
        return sslCert;
    }

    /**
     * ??????The name of the SSL certificate file.
     *
     * @param sslCert The name of the SSL certificate file.
     */
    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    /**
     * ??????The name of the cipher in use for the SSL connection.
     *
     * @return Ssl_cipher - The name of the cipher in use for the SSL connection.
     */
    public String getSslCipher() {
        return sslCipher;
    }

    /**
     * ??????The name of the cipher in use for the SSL connection.
     *
     * @param sslCipher The name of the cipher in use for the SSL connection.
     */
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * ??????The name of the SSL key file.
     *
     * @return Ssl_key - The name of the SSL key file.
     */
    public String getSslKey() {
        return sslKey;
    }

    /**
     * ??????The name of the SSL key file.
     *
     * @param sslKey The name of the SSL key file.
     */
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    /**
     * ??????Displays which interface is employed when connecting to the MySQL server
     *
     * @return Bind - Displays which interface is employed when connecting to the MySQL server
     */
    public String getBind() {
        return bind;
    }

    /**
     * ??????Displays which interface is employed when connecting to the MySQL server
     *
     * @param bind Displays which interface is employed when connecting to the MySQL server
     */
    public void setBind(String bind) {
        this.bind = bind;
    }

    /**
     * ??????The number of server IDs to be ignored, followed by the actual server IDs
     *
     * @return Ignored_server_ids - The number of server IDs to be ignored, followed by the actual server IDs
     */
    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    /**
     * ??????The number of server IDs to be ignored, followed by the actual server IDs
     *
     * @param ignoredServerIds The number of server IDs to be ignored, followed by the actual server IDs
     */
    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    /**
     * ??????The master server uuid.
     *
     * @return Uuid - The master server uuid.
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * ??????The master server uuid.
     *
     * @param uuid The master server uuid.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * ??????The file used for the Certificate Revocation List (CRL)
     *
     * @return Ssl_crl - The file used for the Certificate Revocation List (CRL)
     */
    public String getSslCrl() {
        return sslCrl;
    }

    /**
     * ??????The file used for the Certificate Revocation List (CRL)
     *
     * @param sslCrl The file used for the Certificate Revocation List (CRL)
     */
    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    /**
     * ??????The path used for Certificate Revocation List (CRL) files
     *
     * @return Ssl_crlpath - The path used for Certificate Revocation List (CRL) files
     */
    public String getSslCrlpath() {
        return sslCrlpath;
    }

    /**
     * ??????The path used for Certificate Revocation List (CRL) files
     *
     * @param sslCrlpath The path used for Certificate Revocation List (CRL) files
     */
    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    /**
     * ??????Tls version
     *
     * @return Tls_version - Tls version
     */
    public String getTlsVersion() {
        return tlsVersion;
    }

    /**
     * ??????Tls version
     *
     * @param tlsVersion Tls version
     */
    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    /**
     * ??????The file containing public key of master server.
     *
     * @return Public_key_path - The file containing public key of master server.
     */
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    /**
     * ??????The file containing public key of master server.
     *
     * @param publicKeyPath The file containing public key of master server.
     */
    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }
}