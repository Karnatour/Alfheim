package dev.redstudio.alfheim.api;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;

/// @author Luna Lage (Desoroxxx)
/// @author Angeline (@jellysquid)
/// @version 2023-09-06
/// @since 1.0
public interface IChunkLightingData {

    short[] alfheim$getNeighborLightChecks();

    void alfheim$setNeighborLightChecks(final short[] data);

    boolean alfheim$isLightInitialized();

    void alfheim$setLightInitialized(final boolean lightInitialized);

    void alfheim$setSkylightUpdatedPublic();

    void alfheim$initNeighborLightChecks();

    byte alfheim$getCachedLightFor(final EnumSkyBlock enumSkyBlock, final BlockPos pos);
}
