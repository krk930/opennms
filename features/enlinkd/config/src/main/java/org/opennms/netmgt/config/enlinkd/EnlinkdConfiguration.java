/*******************************************************************************
 * This file is part of OpenNMS(R).
 * 
 * Copyright (C) 2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *     http://www.gnu.org/licenses/
 * 
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.config.enlinkd;


import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.opennms.core.xml.ValidateUsing;
import org.opennms.netmgt.config.utils.ConfigUtils;

/**
 * Top-level element for the enlinkd-configuration.xml
 *  configuration file.
 */
@XmlRootElement(name = "enlinkd-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("enlinkd-configuration.xsd")
public class EnlinkdConfiguration implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The max number of m_threads used for polling snmp
     *  devices and discovery links.
     */
    @XmlAttribute(name = "threads", required = true)
    private Integer m_threads;

    /**
     * The initial sleep time in mill seconds before starting
     *  node Link Discovery.
     */
    @XmlAttribute(name = "initial_sleep_time")
    private Long m_initialSleepTime;

    /**
     * Node Link Discovery Rescan Time interval in millseconds.
     */
    @XmlAttribute(name = "rescan_interval")
    private Long m_rescanInterval;

    /**
     *  Bridge Topology Discovery Time interval in mill seconds.
     */
    @XmlAttribute(name = "bridge_topology_interval")
    private Long m_bridgeTopologyInterval;

    /**
     *  Topology Discovery Time interval in mill seconds.
     */
    @XmlAttribute(name = "topology_interval")
    private Long m_topologyInterval;

    /**
     * Max bridge forwarding table to hold in memory.
     */
    @XmlAttribute(name = "max_bft")
    private Integer m_maxBft;

    /**
     * The number of threads used for calculate bridge topology 
     */
    @XmlAttribute(name = "discovery-bridge-threads")
    private Integer m_discoveryBridgeThreads;

    /**
     * Whether links discovery process should use
     *  cisco discovery protocol cache table.
     */
    @XmlAttribute(name = "use-cdp-discovery")
    private Boolean m_useCdpDiscovery;

    /**
     * Whether links discovery process should use
     *  Bridge mib data.
     */
    @XmlAttribute(name = "use-bridge-discovery")
    private Boolean m_useBridgeDiscovery;

    /**
     * Whether links discovery process should use
     *  lldp mib data.
     */
    @XmlAttribute(name = "use-lldp-discovery")
    private Boolean m_useLldpDiscovery;

    /**
     * Whether links discovery process should use
     *  ospf mib data.
     */
    @XmlAttribute(name = "use-ospf-discovery")
    private Boolean m_useOspfDiscovery;

    /**
     * Whether links discovery process should use
     *  isis mib data.
     */
    @XmlAttribute(name = "use-isis-discovery")
    private Boolean m_useIsisDiscovery;

    @XmlAttribute(name = "disable-bridge-vlan-discovery")
    private Boolean m_disableBridgeVlanDiscovery;

    public EnlinkdConfiguration() {
    }

    public Integer getThreads() {
        return m_threads;
    }

    public void setThreads(final Integer threads) {
        m_threads = ConfigUtils.assertNotNull(threads, "threads");
    }

    public Long getInitialSleepTime() {
        return m_initialSleepTime == null? 60000L : m_initialSleepTime;
    }

    public void setInitialSleepTime(final Long initialSleepTime) {
        m_initialSleepTime = initialSleepTime;
    }

    public Long getRescanInterval() {
        return m_rescanInterval == null? 86400000L : m_rescanInterval;
    }

    public void setRescanInterval(final Long rescanInterval) {
        m_rescanInterval = rescanInterval;
    }

    public Long getBridgeTopologyInterval() {
        return m_bridgeTopologyInterval == null? 300000L : m_bridgeTopologyInterval;
    }

    public void setBridgeTopologyInterval(Long bridgeTopologyInterval) {
        m_bridgeTopologyInterval = bridgeTopologyInterval;
    }

    public Long getTopologyInterval() {
        return m_topologyInterval == null? 30000L : m_topologyInterval;
    }

    public void setTopologyInterval(Long topologyInterval) {
        m_topologyInterval = topologyInterval;
    }

    public Integer getMaxBft() {
        return m_maxBft != null ? m_maxBft : 100;
    }

    public void setMaxBft(final Integer maxBft) {
        m_maxBft = maxBft;
    }

    public Integer getDiscoveryBridgeThreads() {
        return m_discoveryBridgeThreads != null ? m_discoveryBridgeThreads : 1;
    }

    public void setDiscoveryBridgeThreads(Integer discoveryBridgeThreads) {
        m_discoveryBridgeThreads = discoveryBridgeThreads;
    }

    public Boolean getUseCdpDiscovery() {
        return m_useCdpDiscovery != null ? m_useCdpDiscovery : true;
    }

    public void setUseCdpDiscovery(final Boolean useCdpDiscovery) {
        m_useCdpDiscovery = useCdpDiscovery;
    }

    public Boolean getUseBridgeDiscovery() {
        return m_useBridgeDiscovery != null ? m_useBridgeDiscovery : true;
    }

    public void setUseBridgeDiscovery(final Boolean useBridgeDiscovery) {
        m_useBridgeDiscovery = useBridgeDiscovery;
    }

    public Boolean getUseLldpDiscovery() {
        return m_useLldpDiscovery != null ? m_useLldpDiscovery : true;
    }

    public void setUseLldpDiscovery(final Boolean useLldpDiscovery) {
        this.m_useLldpDiscovery = useLldpDiscovery;
    }

    public Boolean getUseOspfDiscovery() {
        return m_useOspfDiscovery != null ? m_useOspfDiscovery : true;
    }

    public void setUseOspfDiscovery(final Boolean useOspfDiscovery) {
        m_useOspfDiscovery = useOspfDiscovery;
    }

    public Boolean getUseIsisDiscovery() {
        return m_useIsisDiscovery != null ? m_useIsisDiscovery : true;
    }

    public void setUseIsisDiscovery(final Boolean useIsisDiscovery) {
        m_useIsisDiscovery = useIsisDiscovery;
    }

    public Boolean getDisableBridgeVlanDiscovery() {
        return m_disableBridgeVlanDiscovery;
    }

    public void setDisableBridgeVlanDiscovery(Boolean disableBridgeVlanDiscovery) {
        this.m_disableBridgeVlanDiscovery = disableBridgeVlanDiscovery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            m_threads,
            m_initialSleepTime,
            m_rescanInterval,
            m_bridgeTopologyInterval,
            m_topologyInterval,
            m_maxBft,
            m_discoveryBridgeThreads,
            m_useCdpDiscovery,
            m_useBridgeDiscovery,
            m_useLldpDiscovery,
            m_useOspfDiscovery,
            m_useIsisDiscovery,
            m_disableBridgeVlanDiscovery);
    }

    @Override
    public boolean equals(final Object obj) {
        if ( this == obj ) {
            return true;
        }
        
        if (obj instanceof EnlinkdConfiguration) {
            final EnlinkdConfiguration that = (EnlinkdConfiguration)obj;
            return Objects.equals(this.m_threads, that.m_threads)
                && Objects.equals(this.m_initialSleepTime, that.m_initialSleepTime)
                && Objects.equals(this.m_rescanInterval, that.m_rescanInterval)
                && Objects.equals(this.m_bridgeTopologyInterval, that.m_bridgeTopologyInterval)
                && Objects.equals(this.m_topologyInterval, that.m_topologyInterval)
                && Objects.equals(this.m_maxBft, that.m_maxBft)
                && Objects.equals(this.m_discoveryBridgeThreads, that.m_discoveryBridgeThreads)
                && Objects.equals(this.m_useCdpDiscovery, that.m_useCdpDiscovery)
                && Objects.equals(this.m_useBridgeDiscovery, that.m_useBridgeDiscovery)
                && Objects.equals(this.m_useLldpDiscovery, that.m_useLldpDiscovery)
                && Objects.equals(this.m_useOspfDiscovery, that.m_useOspfDiscovery)
                && Objects.equals(this.m_useIsisDiscovery, that.m_useIsisDiscovery)
                && Objects.equals(this.m_disableBridgeVlanDiscovery, that.m_disableBridgeVlanDiscovery);
        }
        return false;
    }

}
