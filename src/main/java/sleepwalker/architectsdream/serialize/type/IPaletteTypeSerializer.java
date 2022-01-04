package sleepwalker.architectsdream.serialize.type;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import sleepwalker.architectsdream.exseption.NBTParseException;
import sleepwalker.architectsdream.structure.container.IVerifiable;

import javax.annotation.Nonnull;

public interface IPaletteTypeSerializer<T extends IVerifiable> {
    CompoundNBT serialize(T src);
    @Nonnull
    public abstract IVerifiable deserialize(CompoundNBT entity) throws NBTParseException;
    @Nonnull
    public abstract ResourceLocation getRegistryName();

    @Nonnull
    Class<T> getClassType();
}
