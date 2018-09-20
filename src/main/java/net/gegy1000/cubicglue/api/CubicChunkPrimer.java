package net.gegy1000.cubicglue.api;

import mcp.MethodsReturnNonnullByDefault;
import net.gegy1000.cubicglue.util.CubicPos;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public interface CubicChunkPrimer {
    void prime(CubicPos pos, ChunkPrimeWriter writer);
}
