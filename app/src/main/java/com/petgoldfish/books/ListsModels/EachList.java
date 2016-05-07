package com.petgoldfish.books.ListsModels;

public class EachList
{
    private String last_modified;

    private Results[] results;

    private String status;

    private String num_results;

    private String copyright;

    public String getLast_modified ()
    {
        return last_modified;
    }

    public void setLast_modified (String last_modified)
    {
        this.last_modified = last_modified;
    }

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getNum_results ()
    {
        return num_results;
    }

    public void setNum_results (String num_results)
    {
        this.num_results = num_results;
    }

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [last_modified = "+last_modified+", results = "+results+", status = "+status+", num_results = "+num_results+", copyright = "+copyright+"]";
    }
}