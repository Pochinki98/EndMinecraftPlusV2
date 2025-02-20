package cn.serendipityr.EndMinecraftPlusV2.VersionControl.NewVersion.ForgeProtocol;

import com.github.steveice10.packetlib.packet.Packet;

public abstract class MCForgeHandShake {
    protected MCForge forge;

    public MCForgeHandShake(MCForge forge) {
        this.forge = forge;
    }

    public abstract void handle(Packet recvPacket);
    public abstract String getFMLVersion();
}
