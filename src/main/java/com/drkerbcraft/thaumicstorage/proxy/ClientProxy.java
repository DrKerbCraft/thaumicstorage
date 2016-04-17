package com.drkerbcraft.thaumicstorage.proxy;


import com.drkerbcraft.thaumicstorage.init.ThaumicStorageItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        ThaumicStorageItems.registerRenders();
    }

}
