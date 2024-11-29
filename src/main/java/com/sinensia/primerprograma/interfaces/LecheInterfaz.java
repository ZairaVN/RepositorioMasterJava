package com.sinensia.primerprograma.interfaces;

import com.sinensia.primerprograma.herencia.Oveja;
import com.sinensia.primerprograma.herencia.Vaca;

public sealed interface LecheInterfaz permits Vaca, Oveja {
    public abstract void darLeche();
}
