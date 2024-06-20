stk.v.11.0
WrittenBy    STK_v11.2.0

BEGIN	CommSystem

Name	CommSystem1
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "CommSystem">
    <SCOPE Class = "CommSystem">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;CommSystem&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;CommSystem&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;CommSystem&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;CommSystem&quot;</STRING>
        </VAR>
        <VAR name = "ReadOnly">
            <BOOL>false</BOOL>
        </VAR>
        <VAR name = "Clonable">
            <BOOL>true</BOOL>
        </VAR>
        <VAR name = "Category">
            <STRING>&quot;&quot;</STRING>
        </VAR>
        <VAR name = "TransmittersLink">
            <SCOPE>
                <VAR name = "Transmitters">
                    <LISTLINKTOOBJ>
                        <STRING>&quot;Constellation/TX&quot;</STRING>
                    </LISTLINKTOOBJ>
                </VAR>
            </SCOPE>
        </VAR>
        <VAR name = "ReceiversLink">
            <SCOPE>
                <VAR name = "Receivers">
                    <LISTLINKTOOBJ>
                        <STRING>&quot;Constellation/RX&quot;</STRING>
                    </LISTLINKTOOBJ>
                </VAR>
            </SCOPE>
        </VAR>
        <VAR name = "CalculateInterference">
            <BOOL>true</BOOL>
        </VAR>
        <VAR name = "ReferenceBandwidth">
            <STRING>&quot;4 kHz&quot;</STRING>
        </VAR>
        <VAR name = "InterferenceSourcesLink">
            <SCOPE>
                <VAR name = "InterferenceSources">
                    <LISTLINKTOOBJ>
                        <STRING>&quot;Constellation/interference&quot;</STRING>
                    </LISTLINKTOOBJ>
                </VAR>
            </SCOPE>
        </VAR>
        <VAR name = "ConstrainingRole">
            <STRING>&quot;Receive&quot;</STRING>
        </VAR>
        <VAR name = "LinkCriteria">
            <VAR name = "Minimum Range">
                <SCOPE Class = "LinkSelectionRule">
                    <VAR name = "Type">
                        <STRING>&quot;Minimum Range&quot;</STRING>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
        <VAR name = "TimePeriod">
            <SCOPE Class = "Interval">
                <PROP name = "SmartInterval">
                    <BOOL>true</BOOL>
                </PROP>
                <VAR name = "Interval">
                    <PROP name = "Type">
                        <STRING>&quot;Implicit&quot;</STRING>
                    </PROP>
                    <SCOPE Class = "ImplicitScope">
                        <VAR name = "IntervalEventName">
                            <STRING>&quot;Scenario/Scenario1 AnalysisInterval&quot;</STRING>
                        </VAR>
                    </SCOPE>
                </VAR>
            </SCOPE>
        </VAR>
        <VAR name = "StepSize">
            <QUANTITY Dimension = "TimeUnit" Unit = "sec">
                <REAL>60</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "SaveMode">
            <STRING>&quot;Save compute data&quot;</STRING>
        </VAR>
        <VAR name = "AccessOptions">
            <SCOPE>
                <VAR name = "UseLightTimeDelay">
                    <BOOL>true</BOOL>
                </VAR>
                <VAR name = "TimeDelayConvergence">
                    <QUANTITY Dimension = "TimeUnit" Unit = "sec">
                        <REAL>5e-05</REAL>
                    </QUANTITY>
                </VAR>
                <VAR name = "AberrationType">
                    <STRING>&quot;Annual&quot;</STRING>
                </VAR>
                <VAR name = "EventDetection">
                    <VAR name = "Subsample">
                        <SCOPE Class = "AccessDetectionMethod">
                            <VAR name = "TimeConvergence">
                                <QUANTITY Dimension = "TimeUnit" Unit = "sec">
                                    <REAL>0.005</REAL>
                                </QUANTITY>
                            </VAR>
                            <VAR name = "AbsValueConvergence">
                                <REAL>1e-14</REAL>
                            </VAR>
                            <VAR name = "RelValueConvergence">
                                <REAL>1e-08</REAL>
                            </VAR>
                            <VAR name = "Type">
                                <STRING>&quot;Subsample&quot;</STRING>
                            </VAR>
                        </SCOPE>
                    </VAR>
                </VAR>
                <VAR name = "SamplingMethod">
                    <VAR name = "Adaptive">
                        <SCOPE Class = "SamplingMethod">
                            <VAR name = "MaxTimeStep">
                                <QUANTITY Dimension = "TimeUnit" Unit = "sec">
                                    <REAL>360</REAL>
                                </QUANTITY>
                            </VAR>
                            <VAR name = "MinTimeStep">
                                <QUANTITY Dimension = "TimeUnit" Unit = "sec">
                                    <REAL>0.01</REAL>
                                </QUANTITY>
                            </VAR>
                            <VAR name = "Type">
                                <STRING>&quot;Adaptive&quot;</STRING>
                            </VAR>
                        </SCOPE>
                    </VAR>
                </VAR>
            </SCOPE>
        </VAR>
    </SCOPE>
</VAR>
END	CommSystem

BEGIN Extensions
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Graphics
        BEGIN Graphics
            BEGIN ShowGfx
                Show      On
            END ShowGfx
            BEGIN AgECsGfxLink
                Name         "Desired Links"
                Display2D    1
                Display3D    1
                LineColor    #00ff00
                LinePattern  0
                LineWidth    2
            END AgECsGfxLink
            BEGIN AgECsGfxInterferer
                Name         "Interference Sources"
                Display2D    1
                Display3D    1
                LineColor    #ffff00
                LinePattern  0
                LineWidth    1
            END AgECsGfxInterferer
            BEGIN AgECsGfxTopInterferer
                Name         "Primary Interferer Highlight"
                Display2D    1
                Display3D    1
                LineColor    #ff0000
                LinePattern  0
                LineWidth    3
            END AgECsGfxTopInterferer
        END Graphics
    END Graphics

END Extensions
