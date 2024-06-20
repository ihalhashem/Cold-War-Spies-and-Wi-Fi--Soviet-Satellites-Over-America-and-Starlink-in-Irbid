stk.v.11.0
WrittenBy    STK_v11.2.0

BEGIN	Receiver

Name	DLRX
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_Receiver_Object">
    <SCOPE Class = "CommRadarObject">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_Receiver_Object&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK Receiver Object&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK Receiver Object&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK Receiver Object&quot;</STRING>
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
            <VAR name = "Complex_Receiver_Model">
                <SCOPE Class = "Receiver">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;Complex_Receiver_Model&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;Complex model of a receiver&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;Complex Receiver Model&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;Complex model of a receiver&quot;</STRING>
                    </VAR>
                    <VAR name = "ReadOnly">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "Clonable">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "Category">
                        <STRING>&quot;@Top&quot;</STRING>
                    </VAR>
                    <VAR name = "AutoSelectDemodulator">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "Demodulator">
                        <VAR name = "BPSK">
                            <SCOPE Class = "Demodulator">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;BPSK&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Demodulator capable of demodulating a BPSK modulated signal.&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;BPSK&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Demodulator capable of demodulating a BPSK modulated signal.&quot;</STRING>
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
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseFilter">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "Filter">
                        <VAR name = "Butterworth">
                            <SCOPE Class = "Filter">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Butterworth&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;General form of nth order Butterworth filter with flat passband and stopband regions&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Butterworth&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;General form of nth order Butterworth filter with flat passband and stopband regions&quot;</STRING>
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
                                <VAR name = "LowerBandwidthLimit">
                                    <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                        <REAL>-20000000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "UpperBandwidthLimit">
                                    <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                        <REAL>20000000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "InsertionLoss">
                                    <QUANTITY Dimension = "RatioUnit" Unit = "units">
                                        <REAL>1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "Order">
                                    <INT>4</INT>
                                </VAR>
                                <VAR name = "CutoffFrequency">
                                    <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                        <REAL>10000000</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "Bandwidth">
                        <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                            <REAL>73500000</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "AutoScaleBandwidth">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "PreReceiveGainsLosses">
                        <SCOPE>
                            <VAR name = "GainLossList">
                                <LIST />
                            </VAR>
                        </SCOPE>
                    </VAR>
                    <VAR name = "PreDemodGainsLosses">
                        <SCOPE>
                            <VAR name = "GainLossList">
                                <LIST />
                            </VAR>
                        </SCOPE>
                    </VAR>
                    <VAR name = "EnableLinkMargin">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "LinkMarginType">
                        <STRING>&quot;Eb/No&quot;</STRING>
                    </VAR>
                    <VAR name = "LinkMarginThreshold">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "RainOutagePercent">
                        <PROP name = "FormatString">
                            <STRING>&quot;%#6.3f&quot;</STRING>
                        </PROP>
                        <REAL>0.1</REAL>
                    </VAR>
                    <VAR name = "UseRain">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "AntennaControl">
                        <SCOPE>
                            <VAR name = "AntennaReferenceType">
                                <STRING>&quot;Link&quot;</STRING>
                            </VAR>
                            <VAR name = "LinkedAntenna">
                                <LINKTOOBJ>
                                    <STRING>&quot;Antenna/EA&quot;</STRING>
                                </LINKTOOBJ>
                            </VAR>
                            <VAR name = "UsePolarization">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "Polarization">
                                <VAR name = "Linear">
                                    <SCOPE Class = "Polarization">
                                        <VAR name = "ReferenceAxis">
                                            <STRING>&quot;X Axis&quot;</STRING>
                                        </VAR>
                                        <VAR name = "TiltAngle">
                                            <QUANTITY Dimension = "AngleUnit" Unit = "rad">
                                                <REAL>0</REAL>
                                            </QUANTITY>
                                        </VAR>
                                        <VAR name = "CrossPolLeakage">
                                            <QUANTITY Dimension = "RatioUnit" Unit = "units">
                                                <REAL>1e-06</REAL>
                                            </QUANTITY>
                                        </VAR>
                                        <VAR name = "Type">
                                            <STRING>&quot;Linear&quot;</STRING>
                                        </VAR>
                                    </SCOPE>
                                </VAR>
                            </VAR>
                        </SCOPE>
                    </VAR>
                    <VAR name = "ComputeSystemNoiseTemp">
                        <STRING>&quot;Constant&quot;</STRING>
                    </VAR>
                    <VAR name = "ConstantSystemNoiseTemp">
                        <QUANTITY Dimension = "Temperature" Unit = "K">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "ANT2LNALineLoss">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "ANT2LNALineTemperature">
                        <QUANTITY Dimension = "Temperature" Unit = "K">
                            <REAL>290</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "LNA2RcvrLineLoss">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "LNA2RcvrLineTemperature">
                        <QUANTITY Dimension = "Temperature" Unit = "K">
                            <REAL>290</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "LNAGain">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "LNANoiseFigure">
                        <QUANTITY Dimension = "RatioUnit" Unit = "units">
                            <REAL>1.258925411794167</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "LNATemperature">
                        <QUANTITY Dimension = "Temperature" Unit = "K">
                            <REAL>290</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "Frequency">
                        <QUANTITY Dimension = "FrequencyUnit" Unit = "Hz">
                            <REAL>12000000000</REAL>
                        </QUANTITY>
                    </VAR>
                    <VAR name = "FrequencyAutoTracking">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "AntennaNoise">
                        <SCOPE>
                            <VAR name = "ComputeOption">
                                <STRING>&quot;Constant&quot;</STRING>
                            </VAR>
                            <VAR name = "ComputeRainNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeAtmosAbsorpNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeUrbanTerrestrialNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeCloudsFogNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeTropoScintNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeSunNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeEarthNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeCosmicNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "ComputeExternalNoise">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "InheritScenarioEarthTemperature">
                                <BOOL>true</BOOL>
                            </VAR>
                            <VAR name = "LocalEarthTemperature">
                                <QUANTITY Dimension = "Temperature" Unit = "K">
                                    <REAL>290</REAL>
                                </QUANTITY>
                            </VAR>
                            <VAR name = "ConstantNoiseTemp">
                                <QUANTITY Dimension = "Temperature" Unit = "K">
                                    <REAL>290</REAL>
                                </QUANTITY>
                            </VAR>
                            <VAR name = "OtherNoiseTemp">
                                <QUANTITY Dimension = "Temperature" Unit = "K">
                                    <REAL>0</REAL>
                                </QUANTITY>
                            </VAR>
                        </SCOPE>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
    </SCOPE>
</VAR>
END	Receiver

BEGIN Extensions
    
    BEGIN ExternData
    END ExternData
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN AccessConstraints
		LineOfSight   IncludeIntervals 
    END AccessConstraints
    
    BEGIN ObjectCoverage
    END ObjectCoverage
    
    BEGIN Desc
    Begin ShortText

    End ShortText
    Begin LongText

    End LongText
    END Desc
    
    BEGIN Refraction
		RefractionModel	Effective Radius Method

		UseRefractionInAccess		No

		BEGIN ModelData
			RefractionCeiling	5.00000000000000e+03
			MaxTargetAltitude	1.00000000000000e+04
			EffectiveRadius		1.33333333333333e+00

			UseExtrapolation	 Yes


		END ModelData
    END Refraction
    
    BEGIN Crdn
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	Facility1
			Description	Displacement vector to Facility1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Facility/Facility1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393
			Description	Displacement vector to STARLINK-1393
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-DLTX1
			Description	Displacement vector to STARLINK-1393-DLTX1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Transmitter/DLTX1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-IN1
			Description	Displacement vector to STARLINK-1393-IN1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Sensor/IN1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-IN1-INTX1
			Description	Displacement vector to STARLINK-1393-IN1-INTX1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Sensor/IN1/Transmitter/INTX1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-Tracker1
			Description	Displacement vector to STARLINK-1393-Tracker1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Sensor/Tracker1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-Tracker1-SA1
			Description	Displacement vector to STARLINK-1393-Tracker1-Antenna1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Sensor/Tracker1/Antenna/SA1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1393-UPRX1
			Description	Displacement vector to STARLINK-1393-UPRX1
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1393/Receiver/UPRX1
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1394
			Description	Displacement vector to STARLINK-1394
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1394
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1394-DLTX2
			Description	Displacement vector to STARLINK-1394-UPTX2
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1394/Transmitter/DLTX2
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1394-IN2
			Description	Displacement vector to STARLINK-1394-IN2
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1394/Sensor/IN2
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1394-IN2-INTX2
			Description	Displacement vector to STARLINK-1394-IN2-INTX2
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1394/Sensor/IN2/Transmitter/INTX2
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1394-UPRX2
			Description	Displacement vector to STARLINK-1394-DLRX2
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1394/Receiver/UPRX2
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399
			Description	Displacement vector to STARLINK-1399
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-DLTX3
			Description	Displacement vector to STARLINK-1399-UPTX3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Transmitter/DLTX3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-IN3
			Description	Displacement vector to STARLINK-1399-IN3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Sensor/IN3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-IN3-INTX3
			Description	Displacement vector to STARLINK-1399-IN3-INTX3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Sensor/IN3/Transmitter/INTX3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-Tracker3
			Description	Displacement vector to STARLINK-1399-Tracker3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Sensor/Tracker3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-Tracker3-SA3
			Description	Displacement vector to STARLINK-1399-Tracker3-Antenna3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Sensor/Tracker3/Antenna/SA3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1399-UPRX3
			Description	Displacement vector to STARLINK-1399-DLRX3
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1399/Receiver/UPRX3
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402
			Description	Displacement vector to STARLINK-1402
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-DLTX4
			Description	Displacement vector to STARLINK-1402-UPTX4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Transmitter/DLTX4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-IN4
			Description	Displacement vector to STARLINK-1402-IN4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Sensor/IN4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-IN4-INTX4
			Description	Displacement vector to STARLINK-1402-IN4-INTX4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Sensor/IN4/Transmitter/INTX4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-Tracker4
			Description	Displacement vector to STARLINK-1402-Tracker4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Sensor/Tracker4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-Tracker4-SA4
			Description	Displacement vector to STARLINK-1402-Tracker4-Antenna4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Sensor/Tracker4/Antenna/SA4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1402-UPRX4
			Description	Displacement vector to STARLINK-1402-DLRX4
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1402/Receiver/UPRX4
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404
			Description	Displacement vector to STARLINK-1404
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-DLTX5
			Description	Displacement vector to STARLINK-1404-UPTX5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Transmitter/DLTX5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-IN5
			Description	Displacement vector to STARLINK-1404-IN5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Sensor/IN5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-IN5-INTX5
			Description	Displacement vector to STARLINK-1404-IN5-INTX5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Sensor/IN5/Transmitter/INTX5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-Tracker5
			Description	Displacement vector to STARLINK-1404-Tracker5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Sensor/Tracker5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-Tracker5-SA5
			Description	Displacement vector to STARLINK-1404-Tracker5-Antenna5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Sensor/Tracker5/Antenna/SA5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1404-UPRX5
			Description	Displacement vector to STARLINK-1404-DLRX5
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1404/Receiver/UPRX5
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413
			Description	Displacement vector to STARLINK-1413
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-DLTX6
			Description	Displacement vector to STARLINK-1413-UPTX6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Transmitter/DLTX6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-IN6
			Description	Displacement vector to STARLINK-1413-IN6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Sensor/IN6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-IN6-INTX6
			Description	Displacement vector to STARLINK-1413-IN6-INTX6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Sensor/IN6/Transmitter/INTX6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-Tracker6
			Description	Displacement vector to STARLINK-1413-Tracker6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Sensor/Tracker6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-Tracker6-SA6
			Description	Displacement vector to STARLINK-1413-Tracker6-Antenna6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Sensor/Tracker6/Antenna/SA6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1413-UPRX6
			Description	Displacement vector to STARLINK-1413-DLRX6
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1413/Receiver/UPRX6
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414
			Description	Displacement vector to STARLINK-1414
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-DLTX7
			Description	Displacement vector to STARLINK-1414-UPTX7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Transmitter/DLTX7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-IN7
			Description	Displacement vector to STARLINK-1414-IN7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Sensor/IN7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-IN7-INTX7
			Description	Displacement vector to STARLINK-1414-IN7-INTX7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Sensor/IN7/Transmitter/INTX7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-Tracker7
			Description	Displacement vector to STARLINK-1414-Tracker7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Sensor/Tracker7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-Tracker7-SA7
			Description	Displacement vector to STARLINK-1414-Tracker7-Antenna7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Sensor/Tracker7/Antenna/SA7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1414-UPRX7
			Description	Displacement vector to STARLINK-1414-DLRX7
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1414/Receiver/UPRX7
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417
			Description	Displacement vector to STARLINK-1417
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-DLTX8
			Description	Displacement vector to STARLINK-1417-UPTX8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Transmitter/DLTX8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-IN8
			Description	Displacement vector to STARLINK-1417-IN8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Sensor/IN8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-IN8-INTX8
			Description	Displacement vector to STARLINK-1417-IN8-INTX8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Sensor/IN8/Transmitter/INTX8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-Tracker8
			Description	Displacement vector to STARLINK-1417-Tracker8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Sensor/Tracker8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-Tracker8-SA8
			Description	Displacement vector to STARLINK-1417-Tracker8-Antenna8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Sensor/Tracker8/Antenna/SA8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1417-UPRX8
			Description	Displacement vector to STARLINK-1417-DLRX8
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1417/Receiver/UPRX8
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419
			Description	Displacement vector to STARLINK-1419
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-DLTX9
			Description	Displacement vector to STARLINK-1419-UPTX9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Transmitter/DLTX9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-IN9
			Description	Displacement vector to STARLINK-1419-IN9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Sensor/IN9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-IN9-INTX9
			Description	Displacement vector to STARLINK-1419-IN9-INTX9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Sensor/IN9/Transmitter/INTX9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-Tracker9
			Description	Displacement vector to STARLINK-1419-Tracker9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Sensor/Tracker9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-Tracker9-SA9
			Description	Displacement vector to STARLINK-1419-Tracker9-Antenna9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Sensor/Tracker9/Antenna/SA9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1419-UPRX9
			Description	Displacement vector to STARLINK-1419-DLRX9
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1419/Receiver/UPRX9
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422
			Description	Displacement vector to STARLINK-1422
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-DLTX10
			Description	Displacement vector to STARLINK-1422-UPTX10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Transmitter/DLTX10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-IN10
			Description	Displacement vector to STARLINK-1422-IN10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Sensor/IN10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-IN10-INTX10
			Description	Displacement vector to STARLINK-1422-IN10-INTX10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Sensor/IN10/Transmitter/INTX10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-Tracker10
			Description	Displacement vector to STARLINK-1422-Tracker10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Sensor/Tracker10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-Tracker10-SA10
			Description	Displacement vector to STARLINK-1422-Tracker10-Antenna10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Sensor/Tracker10/Antenna/SA10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
		BEGIN	VECTOR
			Type	VECTOR_TOVECTOR
			Name	STARLINK-1422-UPRX10
			Description	Displacement vector to STARLINK-1422-DLRX10
				Origin
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
					END	POINT
				Destination
					BEGIN	POINT
						Type	POINT_LINKTO
						Name	Center
						RelativePath	Satellite/STARLINK-1422/Receiver/UPRX10
					END	POINT
				LTDRefSystem
					BEGIN	SYSTEM
						Type	SYSTEM_LINKTO
						Name	BarycenterICRF
						AbsolutePath	CentralBody/Sun
					END	SYSTEM
				Apparent	No
				TimeConvergence	 1.0000000000000000e-03
				TimeSense	Receive
				IgnoreAberration	No
		END	VECTOR
    END Crdn
    
    BEGIN Graphics

BEGIN Graphics

	ShowGfx           On
	Relative          Off
	ShowBoresight     On
	BoresightMarker   4
	BoresightColor    #ffffff

END Graphics
    END Graphics
    
    BEGIN ContourGfx
	ShowContours      Off
    END ContourGfx
    
    BEGIN Contours
	ActiveContourType Antenna Gain

	BEGIN ContourSet Antenna Gain
		Altitude          0.000000e+00
		ShowAtAltitude    Off
		Projected         On
		Relative          On
		ShowLabels        Off
		LineWidth         1.000000
		DecimalDigits     1
		ColorRamp         On
		ColorRampStartColor   #0000ff
		ColorRampEndColor     #ff0000
		BEGIN ContourDefinition
		BEGIN CntrAntAzEl
			BEGIN AzElPattern
				BEGIN AzElPatternDef
					SetResolutionTogether 0
					CoordinateSystem 0
					NumAzPoints      181
					AzimuthRes       2.000000
					MinAzimuth       -180.000000
					MaxAzimuth       180.000000
					NumElPoints      91
					ElevationRes     1.000000
					MinElevation     0.000000
					MaxElevation     90.000000
				END AzElPatternDef
			END AzElPattern
		END CntrAntAzEl
		END ContourDefinition
	END ContourSet
    END Contours
    
    BEGIN VO
    END VO
    
    BEGIN 3dVolume
        ActiveVolumeType  Antenna Beam

        BEGIN VolumeSet Antenna Beam
            Scale 4.000000
            NumericGainOffset 1.000000
            Frequency 14500000000.000000
            ShowAsWireframe 0
				BEGIN AzElPatternDef
					SetResolutionTogether 0
					CoordinateSystem 0
					NumAzPoints      181
					AzimuthRes       2.000000
					MinAzimuth       -180.000000
					MaxAzimuth       180.000000
					NumElPoints      91
					ElevationRes     1.000000
					MinElevation     0.000000
					MaxElevation     90.000000
				END AzElPatternDef
        END VolumeSet
        BEGIN VolumeGraphics
            ShowContours    No
            ShowVolume No
        END VolumeGraphics
    END 3dVolume

END Extensions
