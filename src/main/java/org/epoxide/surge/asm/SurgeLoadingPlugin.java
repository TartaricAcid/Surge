package org.epoxide.surge.asm;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.SortingIndex(1001)
@IFMLLoadingPlugin.TransformerExclusions("org.epoxide.surge.asm")
// Removing version as 1.9 and 1.10 are supported. @IFMLLoadingPlugin.MCVersion("1.10.2")
public class SurgeLoadingPlugin implements IFMLLoadingPlugin {
    
    public SurgeLoadingPlugin () {
        
    }
    
    @Override
    public String[] getASMTransformerClass () {
        
        return new String[] { SurgeTransformerManager.class.getName() };
    }
    
    @Override
    public String getModContainerClass () {
        
        return null;
    }
    
    @Override
    public String getSetupClass () {
        
        return null;
    }
    
    @Override
    public void injectData (Map<String, Object> data) {
        
        ASMUtils.isSrg = (Boolean) data.get("runtimeDeobfuscationEnabled");
    }
    
    @Override
    public String getAccessTransformerClass () {
        
        return null;
    }
}