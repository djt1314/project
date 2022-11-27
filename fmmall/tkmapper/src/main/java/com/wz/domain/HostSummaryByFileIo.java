package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "host_summary_by_file_io")
public class HostSummaryByFileIo {
    private String host;

    private BigDecimal ios;

    @Column(name = "io_latency")
    private String ioLatency;

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return ios
     */
    public BigDecimal getIos() {
        return ios;
    }

    /**
     * @param ios
     */
    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }

    /**
     * @return io_latency
     */
    public String getIoLatency() {
        return ioLatency;
    }

    /**
     * @param ioLatency
     */
    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }
}