stk.v.11.0
WrittenBy    STK_v11.2.0
BEGIN Scenario
    Name            Scenario1

BEGIN Epoch

    Epoch        5 Jan 2022 10:00:00.000000000
    SmartEpoch
	BEGIN	EVENT
			Epoch	5 Jan 2022 10:00:00.000000000
			EventEpoch
				BEGIN	EVENT
					Type	EVENT_LINKTO
					Name	AnalysisStartTime
				END	EVENT
			EpochState	Implicit
	END	EVENT


END Epoch

BEGIN Interval

Start                   5 Jan 2022 10:00:00.000000000
Stop                    6 Jan 2022 10:00:00.000000000
    SmartInterval
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	5 Jan 2022 10:00:00.000000000
				Stop	6 Jan 2022 10:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

EpochUsesAnalStart      No
AnimStartUsesAnalStart  Yes
AnimStopUsesAnalStop    Yes

END Interval

BEGIN EOPFile

    EOPFilename     EOP-v1.1.txt

END EOPFile

BEGIN GlobalPrefs

    SatelliteNoOrbWarning    No
    MissilePerigeeWarning    No
    MissileStopTimeWarning   No
    AircraftWGS84Warning     Always
END GlobalPrefs

BEGIN CentralBody

    PrimaryBody     Earth

END CentralBody

BEGIN CentralBodyTerrain

    BEGIN CentralBody
        Name            Earth
        UseTerrainCache Yes
        TotalCacheSize  402653184

        BEGIN StreamingTerrain
            UseCurrentStreamingTerrainServer     Yes
            CurrentStreamingTerrainServerName    http://twsusecovacc01.agi.com/stk-terrain
            StreamingTerrainTilesetName    world
            StreamingTerrainServerName           assets.agi.com/stk-terrain/
            StreamingTerrainAzimuthElevationMaskEnabled       No
            StreamingTerrainObscurationEnabled       No
            StreamingTerrainCoverageGridObscurationEnabled       No
        END StreamingTerrain
    END CentralBody

END CentralBodyTerrain

BEGIN StarCollection

    Name     Hipparcos 2 Mag 6

END StarCollection

BEGIN ScenarioLicenses
    Module    AMMv11.2
    Module    ASTGv11.2
    Module    CATv11.2
    Module    CHAINSv11.2
    Module    CONv11.2
    Module    COVv11.2
    Module    CRMv11.2
    Module    Commv11.2
    Module    DISv11.2
    Module    EOIRv11.2
    Module    HRMv11.2
    Module    MexServv11.2
    Module    RT3Clientv11.2
    Module    RdrAdvEnv11.2
    Module    SEETv11.2
    Module    SOLISv11.2
    Module    STKCAP
    Module    STKExpertv11.2
    Module    STKIntegrationv11.2
    Module    STKParallelComputingv11.2
    Module    STKProfessionalv11.2
    Module    STKv11.2
    Module    TERNv11.2
    Module    TIREMv11.2
    Module    UPropv11.2
    Module    Underseav11.2
END ScenarioLicenses

BEGIN QuickReports

    BEGIN Report
        Name    Access
        Type    Report
        BaseDir Install
        Style    Access
        AGIViewer    Yes
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN InstanceList
            Instance    Facility/MyHome/Receiver/DLRX
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        BEGIN ElementUnitList
            BEGIN ElementUnit
                SectionNumber    1
                LineNumber    1
                ElementNumber    4
                Name    Duration
                ServiceName    InviewData
                BEGIN ElemUnitData
                    UseDefaultUnits    No
                    BEGIN ElemDimUnitList
		TimeUnit		Hours
                    END ElemDimUnitList
                END ElemUnitData
            END ElementUnit
        END ElementUnitList
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    330
        WindowRectTop     209
        WindowRectRight   1811
        WindowRectBottom  699
    END Report

    BEGIN Report
        Name    New Graph
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN InstanceList
            Instance    Facility/MyHome/Receiver/DLRX
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    356
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    BER
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN InstanceList
            Instance    Facility/MyHome/Receiver/DLRX
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    382
        WindowRectTop     261
        WindowRectRight   1863
        WindowRectBottom  751
    END Report

    BEGIN Report
        Name    BER1
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN InstanceList
            Instance    Facility/MyHome/Receiver/DLRX
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        1.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    408
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    BER2
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    251
        WindowRectTop     105
        WindowRectRight   1707
        WindowRectBottom  595
    END Report

    BEGIN Report
        Name    New Graph (2)
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    277
        WindowRectTop     131
        WindowRectRight   1733
        WindowRectBottom  621
    END Report

    BEGIN Report
        Name    New Graph (2)1
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    303
        WindowRectTop     157
        WindowRectRight   1759
        WindowRectBottom  647
    END Report

    BEGIN Report
        Name    New Graph (2)2
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    329
        WindowRectTop     183
        WindowRectRight   1785
        WindowRectBottom  673
    END Report

    BEGIN Report
        Name    Carrier to Noise vs Time
        Type    Graph
        BaseDir User
        Style    Carrier to Noise vs Time
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    383
        WindowRectTop     237
        WindowRectRight   1864
        WindowRectBottom  727
    END Report

    BEGIN Report
        Name    Interference Information Detailed
        Type    Report
        BaseDir Install
        Style    Interference Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    407
        WindowRectTop     261
        WindowRectRight   1863
        WindowRectBottom  751
    END Report

    BEGIN Report
        Name    Interference Information Detailed1
        Type    Report
        BaseDir Install
        Style    Interference Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    433
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    Link Information Detailed
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    459
        WindowRectTop     313
        WindowRectRight   1915
        WindowRectBottom  803
    END Report

    BEGIN Report
        Name    Link Information Detailed1
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    381
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    Link Information Detailed2
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    407
        WindowRectTop     261
        WindowRectRight   1863
        WindowRectBottom  751
    END Report

    BEGIN Report
        Name    New Graph1
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    381
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    New Graph2
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    433
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    New Graph3
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    381
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    New Graph4
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    243
        WindowRectTop     74
        WindowRectRight   1923
        WindowRectBottom  811
    END Report

    BEGIN Report
        Name    Link Information Detailed3
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    381
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    New Graph (2)3
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    279
        WindowRectTop     133
        WindowRectRight   1735
        WindowRectBottom  623
    END Report

    BEGIN Report
        Name    New Graph (2)4
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    305
        WindowRectTop     159
        WindowRectRight   1761
        WindowRectBottom  649
    END Report

    BEGIN Report
        Name    New Graph (2)5
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    383
        WindowRectTop     237
        WindowRectRight   1839
        WindowRectBottom  727
    END Report

    BEGIN Report
        Name    New Graph (2)6
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    409
        WindowRectTop     263
        WindowRectRight   1865
        WindowRectBottom  753
    END Report

    BEGIN Report
        Name    New Graph (2)7
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    461
        WindowRectTop     315
        WindowRectRight   1917
        WindowRectBottom  805
    END Report

    BEGIN Report
        Name    Link Information Detailed4
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    303
        WindowRectTop     157
        WindowRectRight   1759
        WindowRectBottom  647
    END Report

    BEGIN Report
        Name    New Graph5
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    407
        WindowRectTop     261
        WindowRectRight   1863
        WindowRectBottom  751
    END Report

    BEGIN Report
        Name    New Graph (2)8
        Type    Graph
        BaseDir User
        Style    New Graph (2)
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    251
        WindowRectTop     105
        WindowRectRight   1707
        WindowRectBottom  595
    END Report

    BEGIN Report
        Name    Access1
        Type    Graph
        BaseDir Install
        Style    Access
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    381
        WindowRectTop     235
        WindowRectRight   1837
        WindowRectBottom  725
    END Report

    BEGIN Report
        Name    BER3
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    407
        WindowRectTop     261
        WindowRectRight   1863
        WindowRectBottom  751
    END Report

    BEGIN Report
        Name    BER4
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    433
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    Link Information Detailed5
        Type    Report
        BaseDir Install
        Style    Link Information Detailed
        AGIViewer    Yes
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    355
        WindowRectTop     209
        WindowRectRight   1811
        WindowRectBottom  699
    END Report

    BEGIN Report
        Name    New Graph6
        Type    Graph
        BaseDir User
        Style    New Graph
        AGIViewer    No
        Instance    CommSystem/CommSystem1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    251
        WindowRectTop     105
        WindowRectRight   1707
        WindowRectBottom  595
    END Report

    BEGIN Report
        Name    BER5
        Type    Graph
        BaseDir User
        Style    BER
        AGIViewer    No
        Instance    Facility/MyHome/Receiver/DLRX
        BEGIN InstanceList
            Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
            Instance    Satellite/STARLINK-1394/Transmitter/DLTX2
            Instance    Satellite/STARLINK-1399/Transmitter/DLTX3
            Instance    Satellite/STARLINK-1402/Transmitter/DLTX4
            Instance    Satellite/STARLINK-1404/Transmitter/DLTX5
            Instance    Satellite/STARLINK-1413/Transmitter/DLTX6
            Instance    Satellite/STARLINK-1414/Transmitter/DLTX7
            Instance    Satellite/STARLINK-1417/Transmitter/DLTX8
            Instance    Satellite/STARLINK-1419/Transmitter/DLTX9
            Instance    Satellite/STARLINK-1422/Transmitter/DLTX10
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    10
                SectionType      2
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 18:10:43.541517595" "6 Jan 2022 06:34:41.627852491"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    433
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    Transmitter Spectrum and Filter
        Type    Graph
        BaseDir Install
        Style    Transmitter Spectrum and Filter
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    433
        WindowRectTop     287
        WindowRectRight   1889
        WindowRectBottom  777
    END Report

    BEGIN Report
        Name    Transmitter Spectrum and Filter1
        Type    Graph
        BaseDir Install
        Style    Transmitter Spectrum and Filter
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    243
        WindowRectTop     74
        WindowRectRight   1923
        WindowRectBottom  811
    END Report

    BEGIN Report
        Name    Transmitter Spectrum and Filter2
        Type    Graph
        BaseDir User
        Style    Transmitter Spectrum and Filter
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    277
        WindowRectTop     131
        WindowRectRight   1733
        WindowRectBottom  621
    END Report

    BEGIN Report
        Name    Transmitter Spectrum and Filter3
        Type    Graph
        BaseDir User
        Style    Transmitter Spectrum and Filter
        AGIViewer    No
        Instance    Satellite/STARLINK-1393/Transmitter/DLTX1
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "5 Jan 2022 10:00:00.000000000" "6 Jan 2022 10:00:00.000000000"
END Intervals

END IntervalList

                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    303
        WindowRectTop     157
        WindowRectRight   1759
        WindowRectBottom  647
    END Report
END QuickReports

BEGIN WebData
        EnableWebTerrainData    No
        SaveWebTerrainDataPasswords    No
        BEGIN ConfigServerDataList
            BEGIN ConfigServerData
                Name "globeserver.agi.com"
                Port 80
                DataURL "bin/getGlobeSvrConfig.pl"
            END ConfigServerData
        END ConfigServerDataList
END WebData

BEGIN Extensions
    
    BEGIN ClsApp
		RangeConstraint         5000.000
		ApoPeriPad              30000.000
		OrbitPathPad            100000.000
		TimeDistPad             30000.000
		OutOfDate               2592000.000
		MaxApoPeriStep          900.000
		ApoPeriAngle            0.785
		UseApogeePerigeeFilter  Yes
		UsePathFilter           No
		UseTimeFilter           No
		UseOutOfDate            Yes
		CreateSats              No
		MaxSatsToCreate         500
		UseModelScale           No
		ModelScale              0.000
		UseCrossRefDb           Yes
		CollisionDB                     stkAllTLE.tce
		CollisionCrossRefDB             stkAllTLE.sd
		ShowLine                Yes
		AnimHighlight           Yes
		StaticHighlight         Yes
		UseLaunchWindow                         No
		LaunchWindowUseEntireTraj               Yes
		LaunchWindowTrajMETStart                0.000
		LaunchWindowTrajMETStop                 900.000
		LaunchWindowStart                       0.000
		LaunchWindowStop                        0.000
		LaunchMETOffset                         0.000
		LaunchWindowUseSecEphem                 No 
		LaunchWindowUseScenFolderForSecEphem    Yes
		LaunchWindowUsePrimEphem                No 
		LaunchWindowUseScenFolderForPrimEphem   Yes
    LaunchWindowIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	5 Jan 2022 10:00:00.000000000
				Stop	6 Jan 2022 10:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

		LaunchWindowUsePrimMTO                  No 
		GroupLaunches                           No 
		LWTimeConvergence                       1.000e-03
		LWRelValueConvergence                   1.000e-08
		LWTSRTimeConvergence                    1.000e-04
		LWTSRRelValueConvergence                1.000e-10
		LaunchWindowStep                        300.000
		MaxTSRStep                              180.000
		MaxTSRRelMotion                         20.000
		UseLaunchArea                           No 
		LaunchAreaOrientation                   North
		LaunchAreaAzimuth                       0.000
		LaunchAreaXLimits                       -10000.000   10000.000
		LaunchAreaYLimits                       -10000.000   10000.000
		LaunchAreaNumXIntrPnts                  1
		LaunchAreaNumYIntrPnts                  1
		LaunchAreaAltReference                  Ellipsoid
		TargetSameStop                          No 
		SkipSurfaceMetric                       No 
		LWAreaTSRRelValueConvergence            1.000e-10
		AreaLaunchWindowStep                    300.000
		AreaMaxTSRStep                          30.000
		AreaMaxTSRRelMotion                     1.000
		ShowLaunchArea                          No 
		ShowBlackoutTracks                      No 
		ShowClearedTracks                       No 
		UseObjectForClearedColor                No 
		BlackoutColor                           #ff0000
		ClearedColor                             #ffffff
		ShowTracksSegments                      Yes
		ShowMinRangeTracks                      Yes
		MinRangeTrackTimeStep                   0.500000
		UsePrimStepForTracks                    Yes
		GfxTracksTimeStep                       30.000
		GfxAreaNumXIntrPnts                     1
		GfxAreaNumYIntrPnts                     1
		CreateLaunchMTO                         No 
		CovarianceSigmaScale                    3.000
		CovarianceMode                          None 
    END ClsApp
    
    BEGIN Units
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		AviatorDistanceUnit		NauticalMiles
		AviatorTimeUnit		Hours
		AviatorAltitudeUnit		Feet
		AviatorFuelQuantityUnit		Pounds
		AviatorRunwayLengthUnit		Kilofeet
		AviatorBearingAngleUnit		Degrees
		AviatorAngleOfAttackUnit		Degrees
		AviatorAttitudeAngleUnit		Degrees
		AviatorGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		AviatorTSFCUnit		TSFCLbmHrLbf
		AviatorPSFCUnit		PSFCLbmHrHp
		AviatorForceUnit		Pounds
		AviatorPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		AviatorAltTimeUnit		Minutes
		AviatorSmallTimeUnit		Seconds
		AviatorEnergyUnit		kilowatt-hours
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END Units
    
    BEGIN ReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		AviatorDistanceUnit		NauticalMiles
		AviatorTimeUnit		Hours
		AviatorAltitudeUnit		Feet
		AviatorFuelQuantityUnit		Pounds
		AviatorRunwayLengthUnit		Kilofeet
		AviatorBearingAngleUnit		Degrees
		AviatorAngleOfAttackUnit		Degrees
		AviatorAttitudeAngleUnit		Degrees
		AviatorGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		AviatorTSFCUnit		TSFCLbmHrLbf
		AviatorPSFCUnit		PSFCLbmHrHp
		AviatorForceUnit		Pounds
		AviatorPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		AviatorAltTimeUnit		Minutes
		AviatorSmallTimeUnit		Seconds
		AviatorEnergyUnit		kilowatt-hours
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ReportUnits
    
    BEGIN ConnectReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		AviatorDistanceUnit		NauticalMiles
		AviatorTimeUnit		Hours
		AviatorAltitudeUnit		Feet
		AviatorFuelQuantityUnit		Pounds
		AviatorRunwayLengthUnit		Kilofeet
		AviatorBearingAngleUnit		Degrees
		AviatorAngleOfAttackUnit		Degrees
		AviatorAttitudeAngleUnit		Degrees
		AviatorGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		AviatorTSFCUnit		TSFCLbmHrLbf
		AviatorPSFCUnit		PSFCLbmHrHp
		AviatorForceUnit		Pounds
		AviatorPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		AviatorAltTimeUnit		Minutes
		AviatorSmallTimeUnit		Seconds
		AviatorEnergyUnit		kilowatt-hours
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ConnectReportUnits
    
    BEGIN ReportFavorites
        BEGIN Class
            Name  CommSystem
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   New Graph
            END Favorite
            BEGIN Favorite
                Type    Report
                BaseDir Install
                Style   Link Information Detailed
            END Favorite
            BEGIN Favorite
                Type    Report
                BaseDir Install
                Style   Interference Information Detailed
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   Carrier to Noise vs Time
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   New Graph (2)
            END Favorite
        END Class
        BEGIN Class
            Name  Transmitter
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   Transmitter Spectrum and Filter
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir Install
                Style   Transmitter Spectrum and Filter
            END Favorite
        END Class
        BEGIN Class
            Name  Access
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   BER
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   New Graph (2)
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   New Graph (2)
            END Favorite
            BEGIN Favorite
                Type    Graph
                BaseDir User
                Style   New Graph
            END Favorite
        END Class
    END ReportFavorites
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN GenDb

		BEGIN Database
		    DbType       Satellite
		    DefDb        stkAllTLE.sd
		    UseMyDb      Off
		    MyDb         .\stkSatDb.sd
		    MaxMatches   2000
		    Use4SOC      On

		BEGIN FieldDefaults

			BEGIN Field
				Name "SSC Number"
				Default "*"
			END Field

			BEGIN Field
				Name "Common Name"
				Default "*"
			END Field

		END FieldDefaults

		END Database

		BEGIN Database
		    DbType       City
		    DefDb        stkCityDb.cd
		    UseMyDb      Off
		    MyDb         \
		    MaxMatches   2000
		    Use4SOC      On

		BEGIN FieldDefaults

			BEGIN Field
				Name "City Name"
				Default "*"
			END Field

		END FieldDefaults

		END Database

		BEGIN Database
		    DbType       Facility
		    DefDb        stkFacility.fd
		    UseMyDb      Off
		    MyDb         .\stkFacility.fd
		    MaxMatches   2000
		    Use4SOC      On

		BEGIN FieldDefaults

		END FieldDefaults

		END Database
    END GenDb
    
    BEGIN SOCDb
        BEGIN Defaults
            BEGIN Catalog Spacecraft
                BEGIN Criteria Name or ID
                    Type  Value
                    Value starlink
                END Criteria
            END Catalog
        END Defaults
    END SOCDb
    
    BEGIN Msgp4Ext
    END Msgp4Ext
    
    BEGIN FileLocations
    END FileLocations
    
    BEGIN Author
	Optimize	No
	UseBasicGlobe	No
	SaveEphemeris	Yes
	SaveScenFolder	No
	BEGIN ExternalFileTypes
	    BEGIN Type
		FileType  Calculation Scalar
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Celestial Image
		Include    No
	    END Type
	    BEGIN Type
		FileType  Cloud
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  EOP
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  External Vector Data
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe Data
		Include    No
	    END Type
	    BEGIN Type
		FileType  Map
		Include    No
	    END Type
	    BEGIN Type
		FileType  Map Image
		Include    No
	    END Type
	    BEGIN Type
		FileType  Marker/Label
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Model
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Object Break-up File
		Include    No
	    END Type
	    BEGIN Type
		FileType  Planetary Ephemeris
		Include    No
	    END Type
	    BEGIN Type
		FileType  Report Style Script
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Report/Graph Style
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Scalar Calculation File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Terrain
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Volume Grid Intervals File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Volumetric File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  WTM
		Include    Yes
	    END Type
	END ExternalFileTypes
	ReadOnly	No
	ViewerPassword	No
	STKPassword	No
	ExcludeInstallFiles	No
	BEGIN ExternalFileList
	END ExternalFileList
    END Author
    
    BEGIN ExportDataFile
    FileType         Ephemeris
    IntervalType     Ephemeris
    TimePeriodStart  0.000000e+00
    TimePeriodStop   0.000000e+00
    StepType         Ephemeris
    StepSize         60.000000
    EphemType        STK
    UseVehicleCentralBody   Yes
    CentralBody      Earth
    SatelliteID      -200000
    CoordSys         ICRF
    NonSatCoordSys   Fixed
    InterpolateBoundaries  Yes
    EphemFormat      Current
    InterpType       9
    InterpOrder      5
    AttCoordSys      Fixed
    Quaternions      0
    ExportCovar      Position
    AttitudeFormat   Current
    TimePrecision      6
    CCSDSDateFormat    YMD
    CCSDSEphFormat     SciNotation
    CCSDSTimeSystem    UTC
    CCSDSRefFrame      ICRF
    UseSatCenterAndFrame   No
    IncludeCovariance      No
    IncludeAcceleration    No
    CCSDSFileFormat      KVN
    END ExportDataFile
    
    BEGIN Desc
    Begin ShortText

    End ShortText
    Begin LongText

    End LongText
    END Desc
    
    BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_RF_Environment">
    <SCOPE Class = "RFEnvironment">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_RF_Environment&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK RF Environment&quot;</STRING>
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
        <VAR name = "PropagationChannel">
            <VAR name = "RF_Propagation_Channel">
                <SCOPE Class = "PropagationChannel">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;RF_Propagation_Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
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
                    <VAR name = "UseITU618Section2p5">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCloudFogModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "CloudFogModel">
                        <VAR name = "ITU-R_P840-6">
                            <SCOPE Class = "CloudFogLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
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
                                <VAR name = "LiquidWaterDensityValueChoice">
                                    <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                </VAR>
                                <VAR name = "CloudCeiling">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>3000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLayerThickness">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>500</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudTemp">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLiqWaterDensity">
                                    <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                        <REAL>0.0075</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "AnnualAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "MonthlyAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LiqWaterAverageDataMonth">
                                    <INT>1</INT>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseTropoScintModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "TropoScintModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "TropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
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
                                <VAR name = "FadeDepthAverageTimeChoice">
                                    <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                </VAR>
                                <VAR name = "ComputeDeepFade">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "FadeOutage">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "PercentTimeRefracGrad">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseRainModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "RainModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "RainLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
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
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "EnableDepolarizationLoss">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseAtmosAbsorptionModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "AtmosAbsorptionModel">
                        <VAR name = "Simple_Satcom">
                            <SCOPE Class = "AtmosphericAbsorptionModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.1 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Simple_Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Simple Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
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
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>293.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "WaterVaporConcentration">
                                    <QUANTITY Dimension = "Density" Unit = "g*m^-3">
                                        <REAL>7.5</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseUrbanTerresPropLossModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UrbanTerresPropLossModel">
                        <VAR name = "Two_Ray">
                            <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Two_Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Two Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
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
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LossFactor">
                                    <REAL>1</REAL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseCustomA">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomB">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomC">
                        <BOOL>false</BOOL>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
        <VAR name = "EarthTemperature">
            <QUANTITY Dimension = "Temperature" Unit = "K">
                <REAL>290</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "RainOutagePercent">
            <PROP name = "FormatString">
                <STRING>&quot;%#6.3f&quot;</STRING>
            </PROP>
            <REAL>0.1</REAL>
        </VAR>
        <VAR name = "ActiveCommSystem">
            <LINKTOOBJ>
                <STRING>&quot;CommSystem/CommSystem1&quot;</STRING>
            </LINKTOOBJ>
        </VAR>
    </SCOPE>
</VAR>    END RfEnv
    
    BEGIN CommRad
    END CommRad
    
    BEGIN RadarCrossSection
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_Radar_RCS_Extension">
    <SCOPE Class = "RadarRCSExtension">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_Radar_RCS_Extension&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK Radar RCS Extension&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK Radar RCS Extension&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK Radar RCS Extension&quot;</STRING>
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
        <VAR name = "Model">
            <VAR name = "Radar_Cross_Section">
                <SCOPE Class = "RCS">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;Radar_Cross_Section&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;Radar Cross Section&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;Radar Cross Section&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;Radar Cross Section&quot;</STRING>
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
                    <VAR name = "FrequencyBandList">
                        <LIST>
                            <SCOPE>
                                <VAR name = "MinFrequency">
                                    <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                        <REAL>2997920</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "ComputeTypeStrategy">
                                    <VAR name = "Constant Value">
                                        <SCOPE Class = "RCS Compute Strategy">
                                            <VAR name = "ConstantValue">
                                                <QUANTITY Dimension = "RcsUnit" Unit = "sqm">
                                                    <REAL>1</REAL>
                                                </QUANTITY>
                                            </VAR>
                                            <VAR name = "Type">
                                                <STRING>&quot;Constant Value&quot;</STRING>
                                            </VAR>
                                            <VAR name = "ComponentName">
                                                <STRING>&quot;Constant Value&quot;</STRING>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                </VAR>
                                <VAR name = "SwerlingCase">
                                    <STRING>&quot;0&quot;</STRING>
                                </VAR>
                            </SCOPE>
                        </LIST>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
    </SCOPE>
</VAR>    END RadarCrossSection
    
    BEGIN RadarClutter
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_Radar_Clutter_Extension">
    <SCOPE Class = "RadarClutterExtension">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_Radar_Clutter_Extension&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK Radar Clutter Extension&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK Radar Clutter Extension&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK Radar Clutter Extension&quot;</STRING>
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
        <VAR name = "ClutterMap">
            <VAR name = "Constant Coefficient">
                <SCOPE Class = "Clutter Map">
                    <VAR name = "ClutterCoefficient">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;Constant Coefficient&quot;</STRING>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;Constant Coefficient&quot;</STRING>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
    </SCOPE>
</VAR>    END RadarClutter
    
    BEGIN Gator
    END Gator
    
    BEGIN Crdn
    END Crdn
    
    BEGIN SpiceExt
    END SpiceExt
    
    BEGIN FlightScenExt
    END FlightScenExt
    
    BEGIN Graphics

BEGIN Animation

    StartTime          5 Jan 2022 10:00:00.000000000
    EndTime            6 Jan 2022 10:00:00.000000000
    CurrentTime        5 Jan 2022 19:31:12.000000000
    Direction          Reverse
    UpdateDelta        5.000000
    RefreshDelta       0.010000
    XRealTimeMult      1.000000
    RealTimeOffset     0.000000
    XRtStartFromPause  Yes

END Animation


        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      On
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

BEGIN WinFonts

    System
    MS Sans Serif,22,0,0
    MS Sans Serif,28,0,0

END WinFonts

BEGIN MapData

    Begin TerrainConverterData
           NorthLat        0.00000000000000e+00
           EastLon         0.00000000000000e+00
           SouthLat        0.00000000000000e+00
           WestLon         0.00000000000000e+00
           ColorByRGB      No
           AltsFromMSL     No
           UseColorRamp    Yes
           UseRegionMinMax Yes
           SizeSameAsSrc   Yes
           MinAltHSV       0.00000000000000e+00 7.00000000000000e-01 8.00000000000000e-01 4.00000000000000e-01
           MaxAltHSV       1.00000000000000e+06 0.00000000000000e+00 2.00000000000000e-01 1.00000000000000e+00
           SmoothColors    Yes
           CreateChunkTrn  No
           OutputFormat    PDTTX
    End TerrainConverterData

    DisableDefKbdActions     Off
    TextShadowStyle          Dark
    TextShadowColor          #000000
    BingLevelOfDetailScale   2.000000
    BEGIN Map
        MapNum         1
        TrackingMode   LatLon
        PickEnabled    On
        PanEnabled     On

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      -8.973294
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground On
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    -8.973294
                    ZoomWidth    324.000000
                    ZoomHeight   162.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      Off
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData
    END Map

    BEGIN MapStyles

        UseStyleTime        No

        BEGIN Style
        Name                DefaultWithBing
        Time                0.000000
        UpdateDelta         10.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground On
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

        BEGIN Style
        Name                DefaultWithoutBing
        Time                0.000000
        UpdateDelta         10.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground Off
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

    END MapStyles

END MapData

        BEGIN GfxClassPref

        END GfxClassPref


        BEGIN ConnectGraphicsOptions

            AsyncPickReturnUnique          OFF

        END ConnectGraphicsOptions

    END Graphics
    
    BEGIN Overlays
    END Overlays
    
    BEGIN VO
    END VO
    
    BEGIN DIS

		Begin General

			Verbose                    Off
			Processing                 Off
			Statistics                 Off
			ExerciseID                 -1
			ForceID                    -1

		End General


		Begin Output

			Version                    5
			ExerciseID                 1
			forceID                    1
			HeartbeatTimer             5.000000
			DistanceThresh             1.000000
			OrientThresh               3.000000

		End Output


		Begin Time

			Mode                       rtPDUTimestamp

		End Time


		Begin PDUInfo


		End PDUInfo


		Begin Parameters

			ParmData  COLORFRIENDLY        blue
			ParmData  COLORNEUTRAL         white
			ParmData  COLOROPFORCE         red
			ParmData  MAXDRELSETS          1000

		End Parameters


		Begin Network

			NetIF                      Default
			Mode                       Broadcast
			McastIP                    224.0.0.1
			Port                       3000
			rChannelBufferSize         65000
			ReadBufferSize             1500
			QueuePollPeriod            20
			MaxRcvQueueEntries         1000
			MaxRcvIOThreads            4
			sChannelBufferSize         65000

		End Network


		Begin EntityTypeDef


#			order: kind:domain:country:catagory:subCatagory:specific:xtra ( -1 = * )


		End EntityTypeDef


		Begin EntityFilter
			Include                    *:*:*
		End EntityFilter

    END DIS

END Extensions

BEGIN SubObjects

Class CommSystem

	CommSystem1

END Class

Class Constellation

	interference
	RX
	TX

END Class

Class Facility

	Facility1
	MyHome

END Class

Class Satellite

	STARLINK-1393
	STARLINK-1394
	STARLINK-1399
	STARLINK-1402
	STARLINK-1404
	STARLINK-1413
	STARLINK-1414
	STARLINK-1417
	STARLINK-1419
	STARLINK-1422

END Class

END SubObjects

BEGIN References
    Instance *
        *
        CommSystem/CommSystem1
        Constellation/RX
        Constellation/TX
        Constellation/interference
    END Instance
    Instance CommSystem/CommSystem1
        *
    END Instance
    Instance Constellation/RX
    END Instance
    Instance Constellation/TX
    END Instance
    Instance Constellation/interference
    END Instance
    Instance Facility/Facility1
        Facility/Facility1
        Satellite/STARLINK-1393/Sensor/IN1
        Satellite/STARLINK-1394/Sensor/IN2
        Satellite/STARLINK-1399/Sensor/IN3
        Satellite/STARLINK-1402/Sensor/IN4
        Satellite/STARLINK-1404/Sensor/IN5
        Satellite/STARLINK-1413/Sensor/IN6
        Satellite/STARLINK-1414/Sensor/IN7
        Satellite/STARLINK-1417/Sensor/IN8
        Satellite/STARLINK-1419/Sensor/IN9
        Satellite/STARLINK-1422/Sensor/IN10
    END Instance
    Instance Facility/MyHome
        *
        Constellation/RX
        Facility/MyHome
        Facility/MyHome/Antenna/EA
        Facility/MyHome/Receiver/DLRX
        Facility/MyHome/Transmitter/UPTX
        Satellite/STARLINK-1393/Sensor/Tracker1
        Satellite/STARLINK-1394/Sensor/Tracker2
        Satellite/STARLINK-1399/Sensor/Tracker3
        Satellite/STARLINK-1402/Sensor/Tracker4
        Satellite/STARLINK-1404/Sensor/Tracker5
        Satellite/STARLINK-1413/Sensor/Tracker6
        Satellite/STARLINK-1414/Sensor/Tracker7
        Satellite/STARLINK-1417/Sensor/Tracker8
        Satellite/STARLINK-1419/Sensor/Tracker9
        Satellite/STARLINK-1422/Sensor/Tracker10
    END Instance
    Instance Facility/MyHome/Antenna/EA
        Facility/MyHome/Antenna/EA
    END Instance
    Instance Facility/MyHome/Receiver/DLRX
        Constellation/RX
        Facility/MyHome/Receiver/DLRX
    END Instance
    Instance Facility/MyHome/Transmitter/UPTX
        Facility/MyHome/Transmitter/UPTX
    END Instance
    Instance Satellite/STARLINK-1393
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1393
        Satellite/STARLINK-1393/Receiver/UPRX1
        Satellite/STARLINK-1393/Sensor/IN1
        Satellite/STARLINK-1393/Sensor/Tracker1
        Satellite/STARLINK-1393/Transmitter/DLTX1
    END Instance
    Instance Satellite/STARLINK-1393/Receiver/UPRX1
        Satellite/STARLINK-1393/Receiver/UPRX1
    END Instance
    Instance Satellite/STARLINK-1393/Sensor/IN1
        Constellation/interference
        Satellite/STARLINK-1393/Sensor/IN1
        Satellite/STARLINK-1393/Sensor/IN1/Transmitter/INTX1
    END Instance
    Instance Satellite/STARLINK-1393/Sensor/IN1/Transmitter/INTX1
        Constellation/interference
        Satellite/STARLINK-1393/Sensor/IN1/Transmitter/INTX1
    END Instance
    Instance Satellite/STARLINK-1393/Sensor/Tracker1
        Satellite/STARLINK-1393/Sensor/Tracker1
        Satellite/STARLINK-1393/Sensor/Tracker1/Antenna/SA1
    END Instance
    Instance Satellite/STARLINK-1393/Sensor/Tracker1/Antenna/SA1
        Satellite/STARLINK-1393/Sensor/Tracker1/Antenna/SA1
    END Instance
    Instance Satellite/STARLINK-1393/Transmitter/DLTX1
        Constellation/TX
        Satellite/STARLINK-1393/Transmitter/DLTX1
    END Instance
    Instance Satellite/STARLINK-1394
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1394
        Satellite/STARLINK-1394/Receiver/UPRX2
        Satellite/STARLINK-1394/Sensor/IN2
        Satellite/STARLINK-1394/Sensor/Tracker2
        Satellite/STARLINK-1394/Transmitter/DLTX2
    END Instance
    Instance Satellite/STARLINK-1394/Receiver/UPRX2
        Satellite/STARLINK-1394/Receiver/UPRX2
    END Instance
    Instance Satellite/STARLINK-1394/Sensor/IN2
        Constellation/interference
        Satellite/STARLINK-1394/Sensor/IN2
        Satellite/STARLINK-1394/Sensor/IN2/Transmitter/INTX2
    END Instance
    Instance Satellite/STARLINK-1394/Sensor/IN2/Transmitter/INTX2
        Constellation/interference
        Satellite/STARLINK-1394/Sensor/IN2/Transmitter/INTX2
    END Instance
    Instance Satellite/STARLINK-1394/Sensor/Tracker2
        Satellite/STARLINK-1394/Sensor/Tracker2
        Satellite/STARLINK-1394/Sensor/Tracker2/Antenna/SA2
    END Instance
    Instance Satellite/STARLINK-1394/Sensor/Tracker2/Antenna/SA2
        Satellite/STARLINK-1394/Sensor/Tracker2/Antenna/SA2
    END Instance
    Instance Satellite/STARLINK-1394/Transmitter/DLTX2
        Constellation/TX
        Satellite/STARLINK-1394/Transmitter/DLTX2
    END Instance
    Instance Satellite/STARLINK-1399
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1399
        Satellite/STARLINK-1399/Receiver/UPRX3
        Satellite/STARLINK-1399/Sensor/IN3
        Satellite/STARLINK-1399/Sensor/Tracker3
        Satellite/STARLINK-1399/Transmitter/DLTX3
    END Instance
    Instance Satellite/STARLINK-1399/Receiver/UPRX3
        Satellite/STARLINK-1399/Receiver/UPRX3
    END Instance
    Instance Satellite/STARLINK-1399/Sensor/IN3
        Constellation/interference
        Satellite/STARLINK-1399/Sensor/IN3
        Satellite/STARLINK-1399/Sensor/IN3/Transmitter/INTX3
    END Instance
    Instance Satellite/STARLINK-1399/Sensor/IN3/Transmitter/INTX3
        Constellation/interference
        Satellite/STARLINK-1399/Sensor/IN3/Transmitter/INTX3
    END Instance
    Instance Satellite/STARLINK-1399/Sensor/Tracker3
        Satellite/STARLINK-1399/Sensor/Tracker3
        Satellite/STARLINK-1399/Sensor/Tracker3/Antenna/SA3
    END Instance
    Instance Satellite/STARLINK-1399/Sensor/Tracker3/Antenna/SA3
        Satellite/STARLINK-1399/Sensor/Tracker3/Antenna/SA3
    END Instance
    Instance Satellite/STARLINK-1399/Transmitter/DLTX3
        Constellation/TX
        Satellite/STARLINK-1399/Transmitter/DLTX3
    END Instance
    Instance Satellite/STARLINK-1402
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1402
        Satellite/STARLINK-1402/Receiver/UPRX4
        Satellite/STARLINK-1402/Sensor/IN4
        Satellite/STARLINK-1402/Sensor/Tracker4
        Satellite/STARLINK-1402/Transmitter/DLTX4
    END Instance
    Instance Satellite/STARLINK-1402/Receiver/UPRX4
        Satellite/STARLINK-1402/Receiver/UPRX4
    END Instance
    Instance Satellite/STARLINK-1402/Sensor/IN4
        Constellation/interference
        Satellite/STARLINK-1402/Sensor/IN4
        Satellite/STARLINK-1402/Sensor/IN4/Transmitter/INTX4
    END Instance
    Instance Satellite/STARLINK-1402/Sensor/IN4/Transmitter/INTX4
        Constellation/interference
        Satellite/STARLINK-1402/Sensor/IN4/Transmitter/INTX4
    END Instance
    Instance Satellite/STARLINK-1402/Sensor/Tracker4
        Satellite/STARLINK-1402/Sensor/Tracker4
        Satellite/STARLINK-1402/Sensor/Tracker4/Antenna/SA4
    END Instance
    Instance Satellite/STARLINK-1402/Sensor/Tracker4/Antenna/SA4
        Satellite/STARLINK-1402/Sensor/Tracker4/Antenna/SA4
    END Instance
    Instance Satellite/STARLINK-1402/Transmitter/DLTX4
        Constellation/TX
        Satellite/STARLINK-1402/Transmitter/DLTX4
    END Instance
    Instance Satellite/STARLINK-1404
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1404
        Satellite/STARLINK-1404/Receiver/UPRX5
        Satellite/STARLINK-1404/Sensor/IN5
        Satellite/STARLINK-1404/Sensor/Tracker5
        Satellite/STARLINK-1404/Transmitter/DLTX5
    END Instance
    Instance Satellite/STARLINK-1404/Receiver/UPRX5
        Satellite/STARLINK-1404/Receiver/UPRX5
    END Instance
    Instance Satellite/STARLINK-1404/Sensor/IN5
        Constellation/interference
        Satellite/STARLINK-1404/Sensor/IN5
        Satellite/STARLINK-1404/Sensor/IN5/Transmitter/INTX5
    END Instance
    Instance Satellite/STARLINK-1404/Sensor/IN5/Transmitter/INTX5
        Constellation/interference
        Satellite/STARLINK-1404/Sensor/IN5/Transmitter/INTX5
    END Instance
    Instance Satellite/STARLINK-1404/Sensor/Tracker5
        Satellite/STARLINK-1404/Sensor/Tracker5
        Satellite/STARLINK-1404/Sensor/Tracker5/Antenna/SA5
    END Instance
    Instance Satellite/STARLINK-1404/Sensor/Tracker5/Antenna/SA5
        Satellite/STARLINK-1404/Sensor/Tracker5/Antenna/SA5
    END Instance
    Instance Satellite/STARLINK-1404/Transmitter/DLTX5
        Constellation/TX
        Satellite/STARLINK-1404/Transmitter/DLTX5
    END Instance
    Instance Satellite/STARLINK-1413
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1413
        Satellite/STARLINK-1413/Receiver/UPRX6
        Satellite/STARLINK-1413/Sensor/IN6
        Satellite/STARLINK-1413/Sensor/Tracker6
        Satellite/STARLINK-1413/Transmitter/DLTX6
    END Instance
    Instance Satellite/STARLINK-1413/Receiver/UPRX6
        Satellite/STARLINK-1413/Receiver/UPRX6
    END Instance
    Instance Satellite/STARLINK-1413/Sensor/IN6
        Constellation/interference
        Satellite/STARLINK-1413/Sensor/IN6
        Satellite/STARLINK-1413/Sensor/IN6/Transmitter/INTX6
    END Instance
    Instance Satellite/STARLINK-1413/Sensor/IN6/Transmitter/INTX6
        Constellation/interference
        Satellite/STARLINK-1413/Sensor/IN6/Transmitter/INTX6
    END Instance
    Instance Satellite/STARLINK-1413/Sensor/Tracker6
        Satellite/STARLINK-1413/Sensor/Tracker6
        Satellite/STARLINK-1413/Sensor/Tracker6/Antenna/SA6
    END Instance
    Instance Satellite/STARLINK-1413/Sensor/Tracker6/Antenna/SA6
        Satellite/STARLINK-1413/Sensor/Tracker6/Antenna/SA6
    END Instance
    Instance Satellite/STARLINK-1413/Transmitter/DLTX6
        Constellation/TX
        Satellite/STARLINK-1413/Transmitter/DLTX6
    END Instance
    Instance Satellite/STARLINK-1414
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1414
        Satellite/STARLINK-1414/Receiver/UPRX7
        Satellite/STARLINK-1414/Sensor/IN7
        Satellite/STARLINK-1414/Sensor/Tracker7
        Satellite/STARLINK-1414/Transmitter/DLTX7
    END Instance
    Instance Satellite/STARLINK-1414/Receiver/UPRX7
        Satellite/STARLINK-1414/Receiver/UPRX7
    END Instance
    Instance Satellite/STARLINK-1414/Sensor/IN7
        Constellation/interference
        Satellite/STARLINK-1414/Sensor/IN7
        Satellite/STARLINK-1414/Sensor/IN7/Transmitter/INTX7
    END Instance
    Instance Satellite/STARLINK-1414/Sensor/IN7/Transmitter/INTX7
        Constellation/interference
        Satellite/STARLINK-1414/Sensor/IN7/Transmitter/INTX7
    END Instance
    Instance Satellite/STARLINK-1414/Sensor/Tracker7
        Satellite/STARLINK-1414/Sensor/Tracker7
        Satellite/STARLINK-1414/Sensor/Tracker7/Antenna/SA7
    END Instance
    Instance Satellite/STARLINK-1414/Sensor/Tracker7/Antenna/SA7
        Satellite/STARLINK-1414/Sensor/Tracker7/Antenna/SA7
    END Instance
    Instance Satellite/STARLINK-1414/Transmitter/DLTX7
        Constellation/TX
        Satellite/STARLINK-1414/Transmitter/DLTX7
    END Instance
    Instance Satellite/STARLINK-1417
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1417
        Satellite/STARLINK-1417/Receiver/UPRX8
        Satellite/STARLINK-1417/Sensor/IN8
        Satellite/STARLINK-1417/Sensor/Tracker8
        Satellite/STARLINK-1417/Transmitter/DLTX8
    END Instance
    Instance Satellite/STARLINK-1417/Receiver/UPRX8
        Satellite/STARLINK-1417/Receiver/UPRX8
    END Instance
    Instance Satellite/STARLINK-1417/Sensor/IN8
        Constellation/interference
        Satellite/STARLINK-1417/Sensor/IN8
        Satellite/STARLINK-1417/Sensor/IN8/Transmitter/INTX8
    END Instance
    Instance Satellite/STARLINK-1417/Sensor/IN8/Transmitter/INTX8
        Constellation/interference
        Satellite/STARLINK-1417/Sensor/IN8/Transmitter/INTX8
    END Instance
    Instance Satellite/STARLINK-1417/Sensor/Tracker8
        Satellite/STARLINK-1417/Sensor/Tracker8
        Satellite/STARLINK-1417/Sensor/Tracker8/Antenna/SA8
    END Instance
    Instance Satellite/STARLINK-1417/Sensor/Tracker8/Antenna/SA8
        Satellite/STARLINK-1417/Sensor/Tracker8/Antenna/SA8
    END Instance
    Instance Satellite/STARLINK-1417/Transmitter/DLTX8
        Constellation/TX
        Satellite/STARLINK-1417/Transmitter/DLTX8
    END Instance
    Instance Satellite/STARLINK-1419
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1419
        Satellite/STARLINK-1419/Receiver/UPRX9
        Satellite/STARLINK-1419/Sensor/IN9
        Satellite/STARLINK-1419/Sensor/Tracker9
        Satellite/STARLINK-1419/Transmitter/DLTX9
    END Instance
    Instance Satellite/STARLINK-1419/Receiver/UPRX9
        Satellite/STARLINK-1419/Receiver/UPRX9
    END Instance
    Instance Satellite/STARLINK-1419/Sensor/IN9
        Constellation/interference
        Satellite/STARLINK-1419/Sensor/IN9
        Satellite/STARLINK-1419/Sensor/IN9/Transmitter/INTX9
    END Instance
    Instance Satellite/STARLINK-1419/Sensor/IN9/Transmitter/INTX9
        Constellation/interference
        Satellite/STARLINK-1419/Sensor/IN9/Transmitter/INTX9
    END Instance
    Instance Satellite/STARLINK-1419/Sensor/Tracker9
        Satellite/STARLINK-1419/Sensor/Tracker9
        Satellite/STARLINK-1419/Sensor/Tracker9/Antenna/SA9
    END Instance
    Instance Satellite/STARLINK-1419/Sensor/Tracker9/Antenna/SA9
        Satellite/STARLINK-1419/Sensor/Tracker9/Antenna/SA9
    END Instance
    Instance Satellite/STARLINK-1419/Transmitter/DLTX9
        Constellation/TX
        Satellite/STARLINK-1419/Transmitter/DLTX9
    END Instance
    Instance Satellite/STARLINK-1422
        Constellation/TX
        Constellation/interference
        Satellite/STARLINK-1422
        Satellite/STARLINK-1422/Receiver/UPRX10
        Satellite/STARLINK-1422/Sensor/IN10
        Satellite/STARLINK-1422/Sensor/Tracker10
        Satellite/STARLINK-1422/Transmitter/DLTX10
    END Instance
    Instance Satellite/STARLINK-1422/Receiver/UPRX10
        Satellite/STARLINK-1422/Receiver/UPRX10
    END Instance
    Instance Satellite/STARLINK-1422/Sensor/IN10
        Constellation/interference
        Satellite/STARLINK-1422/Sensor/IN10
        Satellite/STARLINK-1422/Sensor/IN10/Transmitter/INTX10
    END Instance
    Instance Satellite/STARLINK-1422/Sensor/IN10/Transmitter/INTX10
        Constellation/interference
        Satellite/STARLINK-1422/Sensor/IN10/Transmitter/INTX10
    END Instance
    Instance Satellite/STARLINK-1422/Sensor/Tracker10
        Satellite/STARLINK-1422/Sensor/Tracker10
        Satellite/STARLINK-1422/Sensor/Tracker10/Antenna/SA10
    END Instance
    Instance Satellite/STARLINK-1422/Sensor/Tracker10/Antenna/SA10
        Satellite/STARLINK-1422/Sensor/Tracker10/Antenna/SA10
    END Instance
    Instance Satellite/STARLINK-1422/Transmitter/DLTX10
        Constellation/TX
        Satellite/STARLINK-1422/Transmitter/DLTX10
    END Instance
END References

END Scenario
