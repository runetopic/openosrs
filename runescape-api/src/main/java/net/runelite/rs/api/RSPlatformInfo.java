package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPlatformInfo
{
	@Import("os")
	int getOs();

	@Import("os")
	void setOs(int os);

	@Import("arch64")
	boolean isArch64();

	@Import("arch64")
	void setArch64(boolean arch64);

	@Import("osVersion")
	int getOsVersion();

	@Import("osVersion")
	void setOsVersion(int osVersion);

	@Import("vendor")
	int getVendor();

	@Import("vendor")
	void setVendor(int vendor);

	@Import("javaMajor")
	int getJavaMajor();

	@Import("javaMajor")
	void setJavaMajor(int javaMajor);

	@Import("javaMinor")
	int getJavaMinor();

	@Import("javaMinor")
	void setJavaMinor(int javaMinor);

	@Import("javaPatch")
	int getJavaPatch();

	@Import("javaPatch")
	void setJavaPatch(int javaPatch);

	@Import("maxMemory")
	int getMaxMemory();

	@Import("maxMemory")
	void setMaxMemory(int maxMemory);

	@Import("cpuCores")
	int getCpuCores();

	@Import("cpuCores")
	void setCpuCores(int cpuCores);

	@Import("clockSpeed")
	int getClockSpeed();

	@Import("clockSpeed")
	void setClockSpeed(int clockSpeed);
}
